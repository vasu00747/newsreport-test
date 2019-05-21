package com.asminds.springcore.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asminds.springcore.Daoimpl.CoreDaoimpl;

public class Coremain {
	public static void main(String[] args) {
	    ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");  
	    Student1 s=(Student1)context.getBean("sud");
	    CoreDaoimpl c=(CoreDaoimpl)context.getBean("dao");
	    String v=c.insert(s);
	    System.out.println(s);
	    System.out.println("---insert success----");
	    
	}
	

}
