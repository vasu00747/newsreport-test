package com.asminds.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.asminds.Daoimpl.Daoimpl;
import com.asminds.customer.Customer;
@Controller
public class Maincontroller {
	@RequestMapping("/")
	public String first()
	{
	System.out.println("index page");
		return"index";
		
	}
	@RequestMapping("/customerview")
	public String second()
	{
		System.out.println("home page");
		return"home";
		
	}
	@RequestMapping("/selectc")
	public ModelAndView selectc(@ModelAttribute("a")Customer c)
	{
		
		Daoimpl d=new Daoimpl();	
		List<Customer> l=d.selected(c);
		System.out.println("selectall method");
		return new ModelAndView("select","sl",l);
		//return "index";
		 
	}
	@RequestMapping("/selectone")
	public String selecto()
	{
		System.out.println("select one page");
		return"selectone";
		
	}
	
	@RequestMapping("/selectonecontrol")
	public ModelAndView selectonee(@ModelAttribute("f")Customer c)
	{
		Daoimpl d=new Daoimpl();
		List<Customer>l=d.selectoneall(c);
		
		System.out.println(" select one method in controller");
		return new ModelAndView("selectonecus","slctone",l);
	}

	@RequestMapping("/editControl")
	public ModelAndView editup(@ModelAttribute("y")Customer c)
	{
		System.out.println("edit customer fields");
		System.out.println(c.getId());
		Daoimpl d=new Daoimpl();
		List<Customer>l=d.updatese(c);
		System.out.println("edited");
		 return new ModelAndView("edit","editc",l);

	}
	
	@RequestMapping("/editcon")
	public String updatecon(@ModelAttribute("s")Customer c)
	{
		System.out.println("updated sucessfully");
		Daoimpl d=new Daoimpl();
		d.update(c);
		return "home";
				
	}
	@RequestMapping("/deleteone")
	public String deletee()
	{
		System.out.println("delete method");
		return"delete";
	}
	@RequestMapping("/deleteController")
	public String deletecon(@ModelAttribute("g")Customer c)
	{
		System.out.println("deleted");
		Daoimpl d=new Daoimpl();
		d.delete(c);
		return "home";
	}
	
	
	
	
	@RequestMapping("/registration")
	public String third()
	{
		System.out.println("registraion page");
		return"registeration";
		
	}
	@RequestMapping("/validation")
	public String validation11(@ModelAttribute("q")Customer c)
	{
		System.out.println("validation method");
		Daoimpl d=new Daoimpl();	
		d.insert(c);
		System.out.println(c.getId());
		System.out.println(c.getUniqueid());
		System.out.println(c.getName());
		System.out.println(c.getLocation());
		System.out.println(c.getPincode());
		System.out.println(c.getMobileno());
		System.out.println(c.getMailid());
		System.out.println(c.getDevicename());
		System.out.println(c.getIdproof());
		return "success";
	}
	
	@RequestMapping("/getuniqueid")
	public String fifth()
	{
		System.out.println("goto registeration page");
		return "registeration";
	
	}
	
	@RequestMapping("/plan")
	public String sixth()
	{
		System.out.println("plan page");
		return "plan";
	}
	@RequestMapping("/device")
	public String seventh()	
	{
		System.out.println("device page");
		return "device";
	}
	@RequestMapping("/RSLAN1")
	public String eighth()
	{
		System.out.println("electronics page");
		return "electronics";
	}
	@RequestMapping("/RSLAN2")
	public String nineth()
	{
		System.out.println("home appliances page");
		return "homeappliances";
	}

	@RequestMapping("/RSLAN3")
	public String tenth()
	{
		System.out.println("baby&kids page");
		return "baby&kids";
	}
	@RequestMapping("/RSLAN4")
	public String eleventh()
	{
		System.out.println("books page");
		return "books";
	}

	
	
	
	//company view
	
	
	
	
	
	
}
