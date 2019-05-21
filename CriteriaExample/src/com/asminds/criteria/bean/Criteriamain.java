package com.asminds.criteria.bean;

import java.util.Iterator;
import java.util.List;

import javax.persistence.criteria.Order;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class Criteriamain {
	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Criteria critt=s.createCriteria(Productss.class);
		//Criterion cn = Restrictions.gt("price",new Double(2000));
		//Criterion cnn=(Restrictions.and(Restrictions.like("pname", "%P%"),Restrictions.eq("price",new Double(3000))));
		critt.add(Restrictions.and(Restrictions.like("pname", "%P%"),Restrictions.eq("price",new Double(3000))));
		//critt.addOrder(Order.asc("price");
		List l=critt.list();
		System.out.println("list size" +l.size());
		Iterator it=l.iterator();
		while(it.hasNext())
		
		{
			Productss p=(Productss)it.next();
			System.out.println(p.getPid());
			System.out.println(p.getPname());
			System.out.println(p.getprice());
			System.out.println("------------");
				
		}
		s.close();
		sf.close();
		
			
	}

}
