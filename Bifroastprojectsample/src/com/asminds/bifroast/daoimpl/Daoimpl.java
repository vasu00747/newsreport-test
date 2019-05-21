package com.asminds.bifroast.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.asminds.bifroast.bean.Emp;
import com.asminds.bifroast.bean.Review;
import com.asminds.bifroast.dao.Bifroastdao;

public class Daoimpl implements Bifroastdao {

	@Override
	public Boolean insert(Emp e) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory f=cfg.buildSessionFactory();
		Session s=f.openSession();
		Transaction t=s.beginTransaction();
		s.save(e);
		t.commit();
		f.close();
		s.close();
		System.out.println("data saved in db");
		return true;
	}

	@Override
	public Boolean insertr(Review r) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory f=cfg.buildSessionFactory();
		Session s=f.openSession();
		Transaction t=s.beginTransaction();
		s.save(r);
		t.commit();
		f.close();
		s.close();
		System.out.println("review data saved ");
		return true;
	}

	
}
	
