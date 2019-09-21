package com.problem.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

import com.factory.util.FareCalculator;
import com.factory.util.FareStrategyFactory;
import com.problem.dao.InMemoryCardTransactionRepoImpl;
import com.problem.exception.MinimumCardBalanceException;
import com.problem.model.CardTrx;
import com.problem.model.SmartCard;
import com.problem.model.Station;

public class MetroServiceImpl {

	private ConcurrentMap<Station, AtomicInteger> stationFootFall = new ConcurrentHashMap<>();

    private InMemoryCardTransactionRepoImpl trxRepository = new InMemoryCardTransactionRepoImpl();
    private FareCalculator fareCalculator = new FareCalculator();

    public void swipeIn(SmartCard card, Station source, LocalDateTime dateTime) throws MinimumCardBalanceException {
        if (card.getBalance() < 5.5) {
            throw new MinimumCardBalanceException("Minimum balance of Rs 5.5 is required at Swipe In");
        }
        stationFootFall.putIfAbsent(source, new AtomicInteger());
        stationFootFall.get(source).incrementAndGet();
        CardTrx trx = new CardTrx();
        trx.setSource(source);
        trx.setCard(card);
        trx.setStartTime(dateTime);
        trxRepository.addTransientTransaction(card, trx);
    }

    public void swipeOut(SmartCard card, Station destination, LocalDateTime dateTime) {
        stationFootFall.putIfAbsent(destination, new AtomicInteger());
        stationFootFall.get(destination).incrementAndGet();
        CardTrx trx = trxRepository.getTransientTrx(card);
        trx.setDestination(destination);
        trx.setEndTime(dateTime);
        trx.setDistance(destination.distance(trx.source));
        trx.setFare(fareCalculator.getFare(trx.source, trx.destination, dateTime));
        if (trx.getFare() > card.getBalance()) {
          //  throw new InsufficientCardBalance("Insufficient balance at Swipe Out, Please recharge card and try again");
        }
        trx.setFareStrategyUsed(FareStrategyFactory.getFareStrategy(dateTime));
        trx.setBalance(card.getBalance() - trx.getFare());
        card.setBalance(card.getBalance() - trx.getFare());
        trxRepository.addCompletedTransaction(card, trx);
    }
    
    public int calculateFootFall(Station station) {
        return stationFootFall.getOrDefault(station, new AtomicInteger(0)).get();
    }

    public List<CardTrx> cardReport(SmartCard card) {
        List<CardTrx> trxs = trxRepository.getCompletedTrxs(card);
        trxs.forEach(trx -> {
            System.out.println("trx = " + trx);
        });
        return trxs;
    }

}
