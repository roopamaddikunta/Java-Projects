package com.enterprise.hibernate.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String args[]){
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	    SessionFactory sf=cfg.buildSessionFactory();
	    Session ses=sf.openSession();
	    Transaction tx=ses.beginTransaction();
	
	    
	    Person person=new Person(526425896,"Maddie","maddie@gmail.com");
	    Faculty faculty=new Faculty(586932146,"Monroe","monroe@gmail.com","Science",4500);
	    Student student = new Student(45896712,"Sadie","sadie@gmail.com","Advanced Electronics",3.4f);
	    
	    ses.save(person);
	    ses.save(faculty);
	    ses.save(student);
	    
	    tx.commit();
	    
	    System.out.println("Success");
	
	}
}
