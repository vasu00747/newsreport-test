package com.asminds.udsems.DAOImpl;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.asminds.udsems.DAO.EmsDAO;
import com.asminds.udsems.pojoclass.Emspojo;

public class EmsImpl implements EmsDAO{

	@Override
	public boolean insert(Emspojo e) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		s.save(e);
		tx.commit();
		s.close();
		sf.close();
		return true;
	}

	@Override
	public List<Emspojo> select(Emspojo e) {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from Emspojo p");
		List<Emspojo>l=q.list();
		System.out.println("total records"+l.size());
		Iterator it =l.iterator();
		while(it.hasNext()) {
			Emspojo p = (Emspojo)it.next();
			
			System.out.println(p.getAddress());
			System.out.println("...........");
		}
		System.out.println("data selected");
		s.close();
		sf.close();
		return l;
	}

	@Override
	public List<Emspojo> updateview(Emspojo e) {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		System.out.println(e.getEmpid());
		Query q=s.createQuery("from Emspojo p where id="+e.getEmpid());
		List<Emspojo>l=q.list();
		Iterator it =l.iterator();
		while(it.hasNext()) {
			Emspojo p = (Emspojo)it.next();
			System.out.println(p.getEmpid());
			System.out.println(p.getName());
			System.out.println(p.getMobileno());
			System.out.println(p.getAddress());
		}
		System.out.println("data fetched");
		s.close();
		sf.close();
		return l;
	}

	@Override
	public boolean updateall(Emspojo e) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Query q=s.createQuery("UPDATE Emspojo set name = :name,mobileno = :mobileno,address = :address  "  +  "WHERE empid = :empid");
		q.setParameter("name", e.getName());
		q.setParameter("mobileno", e.getMobileno());
		q.setParameter("address", e.getAddress());
		q.setParameter("empid", e.getEmpid());
		int result=q.executeUpdate();
		System.out.println("rows affected"+result);
		tx.commit();
		s.close();
		sf.close();
		return true;
	}

	@Override
	public boolean delete(Emspojo e) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		System.out.println(e.getEmpid());
		Query q=s.createQuery("delete from Emspojo where empid="+e.getEmpid());
		int result=q.executeUpdate();
		System.out.println("deleted successfully");
		tx.commit();
		s.close();
		sf.close();
		return true;
	}

	@Override
	public List<Emspojo> selectoneall(Emspojo e) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from Emspojo p where empid="+e.getEmpid());
		List<Emspojo>l=q.list();
		s.close();
		sf.close();
		return l;
	}

	
	public String deleone(Emspojo e) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Query q=s.createQuery("delete from Emspojo where empid="+e.getEmpid() );
		int result=q.executeUpdate();
		s.close();
		sf.close();
		return null;
	}

}
