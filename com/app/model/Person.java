package com.app.model;


public class Person {

	private int perId;
	private String perName;
	private int age;
	private String gender;
	public int getPerId() {
		return perId;
	}
	public void setPerId(int perId) {
		this.perId = perId;
	}
	public String getPerName() {
		return perName;
	}
	public void setPerName(String perName) {
		this.perName = perName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [perId=" + perId + ", perName=" + perName + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
	
}
