package com.problem.exception;

public class InsufficientBalanceException extends Exception {

	private String message;
	public InsufficientBalanceException(String message){
		this.message=message;
	}
}
