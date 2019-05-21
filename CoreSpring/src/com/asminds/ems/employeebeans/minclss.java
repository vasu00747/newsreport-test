package com.asminds.ems.employeebeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class minclss {
	
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");    
		
		//pojocls s=(pojocls)context.getBean("sud");
		
	 Student s =(Student)context.getBean("sud");
		
		s.ply();
	
		
		
		/*ven s2 =(ven)context.getBean("si");
		s2.siply();
		*/
		
		/*pojocls d = new pojocls();
		d.dis();
		*/
		
	}

}
