package com.file.dto;

public class FileDataDTO {

	String city;
	String country;
	String gender;
	String currency;
	String avgIncome;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getAvgIncome() {
		return avgIncome;
	}
	public void setAvgIncome(String avgIncome) {
		this.avgIncome = avgIncome;
	}
	
	
	public String toString() {
		return "city ::"+this.city+" country "+this.country+" gender "+this.gender+" currency "+this.currency+" Avg Inc "+this.avgIncome;
	}
	
	
}
