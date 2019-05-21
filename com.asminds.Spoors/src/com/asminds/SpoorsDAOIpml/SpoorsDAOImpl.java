package com.asminds.SpoorsDAOIpml;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.asminds.Spoors.Pojo.CustomerPojo;

import com.asminds.SpoorsDAO.SpoorsDAO;

public class SpoorsDAOImpl implements SpoorsDAO{

	@Override
	public boolean insert(CustomerPojo p) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		s.save(p);
		tx.commit();
		s.close();
		sf.close();
		return true;
	}

	@Override
	public List<CustomerPojo> select(CustomerPojo p) {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from CustomerPojo p");
		List<CustomerPojo>l=q.list();
		System.out.println("total records"+l.size());
		Iterator it =l.iterator();
		while(it.hasNext()) {
			CustomerPojo poj = (CustomerPojo)it.next();
			
			System.out.println(poj.getName());
			System.out.println("...........");
		}
		System.out.println("data selected");
		s.close();
		sf.close();
		return l;
	}

	@Override
	public boolean delete(CustomerPojo p) {
		// TODO Auto-generated method stub
		Configuration cf = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory ses = cf.buildSessionFactory();
		Session ss = ses.openSession();
		Transaction tr = ss.beginTransaction();
		ss.delete(p);
		tr.commit();
		ses.close();
		ss.close();
		return true;
	}

	@Override
	public List<CustomerPojo> Selectone(CustomerPojo p) {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		System.out.println(p.getCus());
		Query q=s.createQuery("from CustomerPojo p where id="+p.getCus());
		List<CustomerPojo>l=q.list();
		Iterator it =l.iterator();
		while(it.hasNext()) {
			CustomerPojo po = (CustomerPojo)it.next();
			System.out.println(po.getCus());
			System.out.println(po.getName());
			System.out.println(po.getEmail());
			System.out.println(po.getMobile());
		}
		System.out.println("data fetched");
		s.close();
		sf.close();
		return l;
			
	}

	@Override
	public boolean UpdateAll(CustomerPojo p) {
		// TODO Auto-generated method stub
    Configuration cf = new Configuration().configure("hibernate.cfg.xml");
    SessionFactory ses = cf.buildSessionFactory();
    Session ss = ses.openSession();
    Transaction tr = ss.beginTransaction();
    Query q = ss.createQuery("update CustomerPojo set name = :name, invoice=:invoice, shipping=:shipping, sex=:sex, company=:company, district=:district,email = :email, mobile = :mobile where cus = :cus"); 
	q.setParameter("name", p.getName());
	q.setParameter("invoice", p.getInvoice());
	q.setParameter("shipping", p.getInvoice());
	q.setParameter("sex", p.getInvoice());
	q.setParameter("company", p.getInvoice());
	q.setParameter("district", p.getInvoice());
	q.setParameter("email", p.getInvoice());
	q.setParameter("mobile", p.getMobile());
	q.setParameter("cus", p.getCus());
	int result = q.executeUpdate();
	System.out.println("data updated successfully");
	tr.commit();
	ses.close();
	ss.close();
	return true;
	}

	

}