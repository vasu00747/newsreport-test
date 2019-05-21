package com.asminds.criteria.bean;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class Projectionmain {
	public static void main(String[] args) {
		//only one projection obj		
	/*Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session s=sf.openSession();
	Criteria crit=s.createCriteria(Productss.class);
 crit.setProjection(Projections.property("pname"));
 List l=crit.list();
 Iterator itr=l.iterator();
 while(itr.hasNext())
 {
	 String na=(String)itr.next();
 	 System.out.println(na);
 }
	

}*/
		//more than one projections
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Criteria crit=s.createCriteria(Productss.class);
		ProjectionList pl=Projections.projectionList();
		pl.add(Projections.property("pname"));
		pl.add(Projections.property("price"));
		pl.add(Projections.property("pid"));

	 crit.setProjection(pl);
	 List l=crit.list();
	 Iterator itr=l.iterator();
	 while(itr.hasNext())
	 {
		 Object[] array=(Object[])itr.next();
	 	 System.out.println(array[0]);
	 	 System.out.println(array[1]);
	 	 System.out.println(array[2]);


	 }

}
}
