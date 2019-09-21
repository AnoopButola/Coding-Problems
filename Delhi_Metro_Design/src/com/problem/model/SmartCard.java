package com.problem.model;

public class SmartCard {
  long cardId;
  Traveller traveller;
  Double balance;
public double getBalance() {
	// TODO Auto-generated method stub
	return balance;
}
public long getCardId() {
	return cardId;
}
public void setCardId(long cardId) {
	this.cardId = cardId;
}
public Traveller getTraveller() {
	return traveller;
}
public void setTraveller(Traveller traveller) {
	this.traveller = traveller;
}
public void setBalance(Double balance) {
	this.balance = balance;
}


}
