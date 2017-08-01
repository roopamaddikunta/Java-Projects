package com.enterprise.hibernate.mapping;

public class Student extends Person{
	
	private String coursename;
	private float gpa;
	
	
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	public Student(int ssn, String name, String email,String coursename, float gpa) {
		super(ssn,name,email);
		this.coursename = coursename;
		this.gpa = gpa;
	}
	
	

}
