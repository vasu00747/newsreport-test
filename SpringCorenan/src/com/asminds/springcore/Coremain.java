package com.asminds.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Coremain {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		/*first access the method in Emp class using getbean method*/
		/*Emp em=(Emp)context.getBean("e");
		em.details();*/
		/*first access the variables in Customerr class using getbean method*/

		/*Customerr cus=(Customerr)context.getBean("c");
		System.out.println(cus);*/
		/*using @component annotation we are getting bean for Emp class*/
		/*Emp ee=(Emp)context.getBean("emp");
		ee.details();*/
		/*using @component annotation we are getting bean for Customerr class*/

		/*Customerr cuss=(Customerr)context.getBean("customerr");
		System.out.println(cuss);*/
		/*using @autowired annotation we are getting bean for Emp class*/
		Emp eee=(Emp)context.getBean("emp");
		eee.details();
		/*using @autowired annotation we are getting bean for Customerr class*/
		Customerr cusss=(Customerr)context.getBean("customerr");
		System.out.println(cusss);
		
		
		
		

	}

}
