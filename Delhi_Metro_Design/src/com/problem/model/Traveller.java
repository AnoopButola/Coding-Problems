package com.problem.model;

public class Traveller {

	long id;// we can also take string as id
	String name;
	
	
	
	public Traveller(long id1,String name1){
		this.id=id1;
		this.name=name1;
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
