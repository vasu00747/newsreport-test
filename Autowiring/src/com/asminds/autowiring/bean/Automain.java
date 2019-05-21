package com.asminds.autowiring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Automain {
	public static void main(String[] args) {
	    ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");  
Student ss=context.getBean("ss",Student.class);
ss.display();

	}

}
