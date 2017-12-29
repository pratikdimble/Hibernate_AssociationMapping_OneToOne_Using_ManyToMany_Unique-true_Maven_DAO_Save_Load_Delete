package com.app.model;

import java.util.Date;

public class Passport {
	private long passportNo;
	private String country;
	private Date expiryDate;
	private Person person;
	
	public long getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(long passportNo) {
		this.passportNo = passportNo;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	@Override
	public String toString() {
		return "Passport [passportNo=" + passportNo + ", country=" + country + ", expiryDate=" + expiryDate + "]";
	}
	
	
	

}
