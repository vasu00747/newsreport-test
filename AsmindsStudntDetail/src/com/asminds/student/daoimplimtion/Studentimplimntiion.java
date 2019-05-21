 package com.asminds.student.daoimplimtion;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.asminds.student.dao.Studentdao;
import com.asminds.student.pojo.Studentpojo;
import com.asminds.student.pojo.Updtepojo;

//tiunt@suntecgroup.com

public class Studentimplimntiion implements Studentdao {

	public void insert(Studentpojo login) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(login);
		System.out.println("Object saved successfully.....!!");
		tx.commit();
		session.close();
		factory.close();
		
	}

	public List<Studentpojo> getallStudentpojo() {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		// List cats = session.createSQLQuery("SELECT * FROM
		// Employee").addEntity(Employee.class);
		System.out.println(" Going to get the emp impl");
	List<Studentpojo> list = session.createQuery("from Studentpojo e").list();
		
	//	List<Studentpojo> list = session.createQuery("from Studentpojo where  username='bala' AND collegename=''  ").list();
		System.out.println(list.size());

		session.close();
		factory.close();

		return list;
		}

	public void deleteEmployee(Integer Studentpojoid) {
		// TODO Auto-generated method stub
		
		
		 Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml"); 

	        SessionFactory factory = cfg.buildSessionFactory();
	        Session session = factory.openSession();

	        Object o=session.load(Studentpojo.class,new Integer(Studentpojoid));
	        Studentpojo p=(Studentpojo)o;

	        Transaction tx = session.beginTransaction();
	        session.delete(p);
	        System.out.println("Object Deleted successfully.....!!");
	        tx.commit();
	        session.close();
	        factory.close();
	}

	

	

	public String searchid(Studentpojo id) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml"); 
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Query qry = session.createQuery("from Studentpojo where id= "+id.getId());

        				List l =qry.list();
        				System.out.println("Total Number Of Records : "+l.size());
        				Iterator it = l.iterator();

        				while(it.hasNext())
        				{
        					Object o = (Object)it.next();
        					
        					Studentpojo p = (Studentpojo)o;      
        					
        					
        					System.out.println(p.getDeptname());

        				}		
   
        
        System.out.println("Object id select    successfully.....!!");
        tx.commit();
        session.close();
        factory.close();
	
		return null;
	}

	public List<Studentpojo> updateDao(Updtepojo update) {
		// TODO Auto-generated method stub
		System.out.println("I amin update Dao implemrntation");
		System.out.println(update.getBtn());
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
	
		String hql = "select * from Studentpojo where id =" +update.getBtn();
		System.out.println(hql);
		Query qry = session.createQuery("from Studentpojo where id="+update.getBtn());
		List l =qry.list();
		System.out.println("Total Number Of Records : "+l.size());
		java.util.Iterator it = l.iterator();

		while(it.hasNext())
		{
		
			Studentpojo reg = (Studentpojo)it.next();
			System.out.println(reg.getId());
			System.out.println(reg.getCollegename());
			System.out.println(reg.getDeptname());
		}
		session.close();
		factory.close();
		return l;	}

	public Boolean updateemployeeDao(Studentpojo updateemp) {
		// TODO Auto-generated method stub
		System.out.println("I am in update employee dao implementation");
		System.out.println(updateemp.getDeptname());
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		String hql = "UPDATE Studentpojo set username = :username,collegename = :collegename,deptname = :deptname,*mobno = :mobno "  +  "WHERE id = :id";
	    Query query = session.createQuery(hql);
	    query.setParameter("username", updateemp.getUsername());
	    query.setParameter("collegename", updateemp.getCollegename());
	    query.setParameter("deptname", updateemp.getDeptname());
	    query.setParameter("mobno", updateemp.getMobno());
		query.setParameter("id", updateemp.getId());
	    int result = query.executeUpdate();
	    System.out.println("Rows affected: " + result);
	    t.commit();
	    session.close();
	    factory.close();
	     return true;	
	}

	

}
