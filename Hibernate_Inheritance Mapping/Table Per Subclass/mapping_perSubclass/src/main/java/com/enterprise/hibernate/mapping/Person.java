package com.enterprise.hibernate.mapping;

public class Person extends Object{
	
	private int ssn;
	private String name;
	private String email;
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Person(int ssn, String name, String email) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.email = email;
	}
	
	public Person(){
		super();
	}
	

}
