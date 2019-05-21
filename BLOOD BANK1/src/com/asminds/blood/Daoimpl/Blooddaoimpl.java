package com.asminds.blood.Daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.asminds.blood.bean.Bloodbean;

public class Blooddaoimpl {
	public String insert(Bloodbean b)
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(b);
		t.commit();
		System.out.println("inserted sucessfully");
		sf.close();
		s.close();
		return null;
		
	}

}
