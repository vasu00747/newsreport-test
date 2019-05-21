package com.asminds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asminds.Daoimpl.Daoimpl1;
import com.asminds.customer.Employee;

@Controller
public class maincontroller1{ 
	
	
	@RequestMapping("/companyview")
	public String first()
	{
		
		System.out.println("first method");
		return "company";
		
	}

	@RequestMapping("/registeration")
	public String second()
	{
		System.out.println("second method");
		return "empregisteration";
		
	}

	@RequestMapping("/empregister")
	public String third(@ModelAttribute("k")Employee e)
	{
		Daoimpl1 i=new Daoimpl1();
		i.insert(e);
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getMobileno());
		System.out.println(e.getMailid());
		System.out.println(e.getArea());
		System.out.println(e.getDesignation());


		System.out.println("third method");
		return "success1";
		
	}
	@RequestMapping("/agent")
	public String fourth()
	{
		System.out.println("fourth method");
		return "agent";
		
	}
	@RequestMapping("/southchennai")
	public String fifth()
	{
		System.out.println("fifth method");
		return "southchennai";
	}
	@RequestMapping("/northchennai")
	public String sixth()
	{
		System.out.println("sixth  method");
		return "northchennai";
	}
	@RequestMapping("/electronicss")
	public String seventh()

	{
		System.out.println("seventh method");
		return "broadband";
		
	}
	@RequestMapping("/dashboard")
	public String eighth()
	{
		System.out.println("eighth method");
		return"dashboard";
	}
	
	
}
