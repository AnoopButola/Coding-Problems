package com.problem.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.problem.model.CardTrx;
import com.problem.model.SmartCard;

public class InMemoryCardTransactionRepoImpl implements InMemoryCardTransactionRepo{

	private Map<SmartCard,CardTrx> transientStore=new ConcurrentHashMap<SmartCard,CardTrx>();
	
	private  Map<SmartCard,List<CardTrx>> completedTrxStore=new ConcurrentHashMap<SmartCard,List<CardTrx>>();

	public void addTransientTransaction(SmartCard card,CardTrx cardTrx) {
		transientStore.put(card, cardTrx);
	}
	
	
	public void addCompletedTransaction(SmartCard card,CardTrx cardTrx) {
		completedTrxStore.putIfAbsent(card, new ArrayList<CardTrx>());
		completedTrxStore.get(card).add(cardTrx);
	}
	
	public CardTrx getTransientTrx(SmartCard card) {
        return transientStore.remove(card);
    }

    public List<CardTrx> getCompletedTrxs(SmartCard card) {
        return completedTrxStore.getOrDefault(card, Collections.emptyList());
    }
}
