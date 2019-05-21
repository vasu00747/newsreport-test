package com.asminds.Daoimpl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.asminds.Dao.Dao;
import com.asminds.customer.Customer;



public class Daoimpl implements Dao {
	public String insert(Customer c)
	
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		session.save(c);
		System.out.println("data inserted");

		t.commit();
		session.close();
		factory.close();
		
		return null;

		
	}

	@Override
	public List<Customer> selected(Customer c) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Query q=session.createQuery("from Customer p");
		List<Customer>l=q.list();
		System.out.println("total records"+l.size());
		
		Iterator it=l.iterator();
		while(it.hasNext())
		{                 
			Customer cs =(Customer)it.next();
			System.out.println(cs.getLocation());
			System.out.println(cs.getId());
			System.out.println(cs.getName());
		}

		System.out.println(" selected sucessfully");
		session.close();     
		factory.close();
		// TODO Auto-generated method stub
		return l;
	}
	public List<Customer> updatese(Customer c){
		System.out.println("am in updatese method in impl");
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		String hql = "select * from Customer where id =" +c.getId();
		System.out.println(hql);
		Query q=session.createQuery("from Customer  where id="+c.getId());
		List<Customer>l=q.list();
		System.out.println("total records"+l.size());
		
		Iterator it=l.iterator();
		while(it.hasNext())
		{                 
			Customer cs =(Customer)it.next();
			System.out.println(cs.getLocation());
			System.out.println(cs.getId());
			System.out.println(cs.getName());
		}

		System.out.println("selecteddd sucessfully for update");
		session.close();     
		factory.close();
		// TODO Auto-generated method stub
		return l;
		
		
	}
	public Boolean update(Customer c) {
		// TODO Auto-generated method stub
		System.out.println("I am in update  daoimplementation");
		System.out.println(c.getName());
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		String hql = "UPDATE Customer set name = :name,location = :location,pincode = :pincode,mobileno = :mobileno,mailid =:mailid,devicename =:devicename,idproof =:idproof,uniqueid =:uniqueid"  +  "WHERE id = :id";
	    Query q = session.createQuery(hql);
	    q.setParameter("id", c.getId());
	    q.setParameter("name", c.getName());
	    q.setParameter("location",c.getLocation());
		q.setParameter("pincode", c.getPincode());
		q.setParameter("mailid", c.getMailid());
		q.setParameter("mobileno", c.getMobileno());
		q.setParameter("devicename", c.getDevicename());
		q.setParameter("idproof", c.getIdproof());
		q.setParameter("uniqueid", c.getUniqueid());
	  int result = q.executeUpdate();
	    System.out.println(" data updated: " + result);
	    t.commit();
	    session.close();
	    factory.close();
	     return true;	
	}
	public Boolean delete(Customer c){
		System.out.println("am in delete method in impl");
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.delete(c);
		System.out.println("deleted sucessfully");
		t.commit();
		s.close();
		sf.close();
		return true;
		
		
	}
	public List<Customer> selectoneall(Customer c) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from Customer c where id="+c.getId());
		List<Customer>l=q.list();
		s.close();
		sf.close();
		return l;



	
	}
}
	
		
	

	
	

	
	


