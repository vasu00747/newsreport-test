package com.asminds.bifroast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asminds.bifroast.bean.Emp;
import com.asminds.bifroast.bean.Review;
import com.asminds.bifroast.daoimpl.Daoimpl;

@Controller
public class Maincontroller {
	@RequestMapping("/")
	public String first()
	{
		System.out.println("first method in controller");
		return"index";
		
	}
	@RequestMapping("/register")
	public String second()
	{
		System.out.println("second method in controller");
		return "registeration";
		
	}
	@RequestMapping("/valid")
	public String third(@ModelAttribute("k")Emp e)
	{
		
		System.out.println("third method in controller");
		System.out.println(e.getUsername());
		System.out.println(e.getPassword());
		Daoimpl i=new Daoimpl();
		Boolean b=i.insert(e);
		
  if(b==true)
  {
	return "home";
	
 }
  else
  {
     return "error";
		
			
	}
	}
	@RequestMapping("/review")
	public String fourth()
	{
		System.out.println("fourth method in controller");
		return "review";
		
	}
	@RequestMapping("/click")
	public String fifth()
	{
		System.out.println("fifth method in controller");
		return "rfile";
	}
	@RequestMapping("click1")
	public String sixth()
	{
		System.out.println("sixth method in controller");
		return "rfile";
	}
	@RequestMapping("\revi")
	public String seventh(@ModelAttribute("m")Review r)
	{
		System.out.println("seventh method in controoler");
		Daoimpl d=new Daoimpl();
		Boolean b=d.insertr(r);
		System.out.println(r.getBatchid());
		System.out.println(r.getBatchname());
		System.out.println(r.getStatus());
		System.out.println(r.getPriority());
		System.out.println(r.getDelete());
		System.out.println(r.getCharts());
		System.out.println(r.getInvoice());
		return "review";
	
	}
			





	
}
