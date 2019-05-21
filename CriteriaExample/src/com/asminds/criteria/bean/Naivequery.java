package com.asminds.criteria.bean;

import java.util.Iterator;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Naivequery {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		//SQLQuery q=s.createSQLQuery("select * from products1").addEntity(Productss.class);
		SQLQuery q=s.createSQLQuery("select * from PRODUCTS1");

		List l=q.list();
		System.out.println("list size" +l.size());
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
		//Productss p2=(Productss)itr.next();
			Object[] obj=(Object[])itr.next();
			System.out.println(obj[0]);
			System.out.println(obj[1]);
			System.out.println(obj[2]);

			
		}
	
	}

}
