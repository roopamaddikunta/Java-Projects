package com.abc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	
	
	@SuppressWarnings("deprecation")
	public static void main(String args[]){
		
		
		
		
		
		Configuration cfg=new Configuration().configure("com/abc/hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		
		Session ses=sf.openSession();
		
		Transaction tx= ses.beginTransaction();
		
		EmployeePojo e1=new EmployeePojo();
		
		e1.setId(526);
		e1.setName("Roo");
		e1.setEsalary(8759);
		
		ses.save(e1);
		tx.commit();
		
		System.out.println("success");
		
		
	}

}
