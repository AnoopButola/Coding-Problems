package com.problem.exception;

public class MinimumCardBalanceException extends Exception {

	private String message;
	public MinimumCardBalanceException(String message){
		this.message=message;
	}
}
