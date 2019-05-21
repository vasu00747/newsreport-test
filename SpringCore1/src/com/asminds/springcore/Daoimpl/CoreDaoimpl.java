package com.asminds.springcore.Daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.asminds.springcore.Dao.CoreDao;
import com.asminds.springcore.bean.Student1;

public class CoreDaoimpl implements CoreDao {

	public String insert(Student1 s) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction t=ss.beginTransaction();
		ss.save(s);
		t.commit();
		System.out.println("data inserted");
		ss.close();
		sf.close();
		return null;
	}

	public List<Student1> select(Student1 s) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction t=ss.beginTransaction();
		Query q=ss.createQuery("from Student1 s");
		
		
				
		return null;
	}
	

}
