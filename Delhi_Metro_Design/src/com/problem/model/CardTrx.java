package com.problem.model;

import java.time.LocalDateTime;

import com.fare.strategy.FareStrategy;

public class CardTrx {

	
	long transactionId;
	SmartCard card;
	
	public Station source;
	public Station destination;
	
	Integer distance;
	
	Double balance;
	
	Double fare;
	
	LocalDateTime startTime;
	LocalDateTime endTime;
	
	FareStrategy fareStrategyUsed;

	public long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}

	public SmartCard getCard() {
		return card;
	}

	public void setCard(SmartCard card) {
		this.card = card;
	}

	public Station getSource() {
		return source;
	}

	public void setSource(Station source) {
		this.source = source;
	}

	public Station getDestination() {
		return destination;
	}

	public void setDestination(Station destination) {
		this.destination = destination;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getFare() {
		return fare;
	}

	public void setFare(Double fare) {
		this.fare = fare;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public FareStrategy getFareStrategyUsed() {
		return fareStrategyUsed;
	}

	public void setFareStrategyUsed(FareStrategy fareStrategyUsed) {
		this.fareStrategyUsed = fareStrategyUsed;
	}


	
	public String toString(){
		return "balance is:"+this.balance+" startTime ::"+this.startTime+" endtime::"+this.endTime+" farestratey used::"+this.fareStrategyUsed+" source ::"+this.source+" destination::"+this.destination;
	}
	
}
