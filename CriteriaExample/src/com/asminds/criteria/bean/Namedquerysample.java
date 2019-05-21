package com.asminds.criteria.bean;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Namedquerysample {
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.getNamedQuery("myquery");
		q.setParameter("java4s", new Double(1000));
		List l=q.list();
		System.out.println("list size"+l.size());
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			Productss p=(Productss)itr.next();
			System.out.println(p.getPid()+" "+p.getPname()+" " +p.getprice());
		}
		
	}

}
