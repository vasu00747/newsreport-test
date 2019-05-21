package com.asminds.versioning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Versioningsample {
	public static void main(String[] args) {
		Agents a=new Agents(204,"surya","kumbakonam");
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(a);
		t.commit();
		System.out.println("data inserted");
		s.close();
		sf.close();
		
		
		
		
		
		
		
		
	}

}
