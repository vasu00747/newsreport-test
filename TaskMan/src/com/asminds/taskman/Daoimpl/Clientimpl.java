package com.asminds.taskman.Daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.asminds.taskman.bean.Client;
import com.asminds.taskman.bean.Employ;

public class Clientimpl {
	public Boolean insertc(Client c){
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		session.save(c);
		System.out.println("data inserted in client");
		t.commit();
		session.close();
		factory.close();

	
		return true;
	}
	public Boolean insertemp(Employ e)
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		session.save(e);
		System.out.println("data inserted in employee");
		t.commit();
		session.close();
		factory.close();
		return true;

	}


	

}
