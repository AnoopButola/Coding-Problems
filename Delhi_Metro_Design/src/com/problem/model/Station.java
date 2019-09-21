package com.problem.model;

public enum Station {

	A1,A2,A3,A4,A5,A6,A7,A8,A9,A10;

	public int distance(Station other) {
        return Math.abs(other.ordinal() - this.ordinal());
    }
	
	
	public static void main(String args[]) {
		Station source=Station.A1;
		
		Station dest=Station.A5;
		
		System.out.print(dest.distance(source));
		
		
	}
}
