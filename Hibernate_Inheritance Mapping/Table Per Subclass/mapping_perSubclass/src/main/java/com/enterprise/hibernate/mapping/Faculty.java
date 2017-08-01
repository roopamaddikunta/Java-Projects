package com.enterprise.hibernate.mapping;

public class Faculty extends Person{
	
	private String department;
	private int salary;
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Faculty(int ssn, String name, String email, String department,
			int salary) {
		super(ssn, name, email);
		this.department = department;
		this.salary = salary;
	}
	
	

}
