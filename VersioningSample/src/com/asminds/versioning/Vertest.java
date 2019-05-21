package com.asminds.versioning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Vertest {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Object o=s.load(Agents.class,new Integer(202));
		Agents a=(Agents)o;
		Transaction t=s.beginTransaction();
		a.setLocation("thanjai");
		t.commit();
		System.out.println("data updated");
		s.close();
		sf.close();

		
	}

}
