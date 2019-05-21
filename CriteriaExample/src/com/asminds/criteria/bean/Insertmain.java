package com.asminds.criteria.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Insertmain {
	public static void main(String[] args) {
		Productss p1=new Productss(1004,"phone",1000);
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(p1);
		t.commit();
		System.out.println("data inserted");
		s.close();
		sf.close();
		
		

}
}
