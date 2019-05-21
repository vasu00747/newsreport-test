package com.asminds.udsems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.asminds.udsems.DAOImpl.EmsImpl;
import com.asminds.udsems.pojoclass.Emspojo;

@Controller
public class Emscontroller {
@RequestMapping("/")
public String firstmethod()
{
	System.out.println("firstmethod");
	return "index";
}
@RequestMapping("/register")
public String registermethod()
{
	System.out.println("register");
	return "register";
}
@RequestMapping("/registercontrol")
public String registercontrolmethod(@ModelAttribute("l")Emspojo e)
{
	System.out.println("registercontrol");
	EmsImpl e1=new EmsImpl();
	e1.insert(e);
	return "index";
}
@RequestMapping("/selectal")
public ModelAndView selectmethod(@ModelAttribute("k")Emspojo e)
{
	System.out.println("select");
	EmsImpl e1=new EmsImpl();
	List<Emspojo>l=e1.select(e);
	return new ModelAndView("selecting","slc",l);
}
@RequestMapping()
public ModelAndView updatecontrolmethod(@ModelAttribute("k")Emspojo e)
{
	System.out.println(e.getEmpid());
	System.out.println("updatecontrol");
	EmsImpl e1=new EmsImpl();
	List<Emspojo>l=e1.updateview(e);
	return new ModelAndView("editview","editc",l);
}
@RequestMapping("/editcontrol")
public String editcontrolmethod(@ModelAttribute("l")Emspojo e)
{
	System.out.println("editcontrol");
	EmsImpl e1=new EmsImpl();
	e1.updateall(e);
	return "redirect:/selectal";
}
@RequestMapping("/delect")
public String delectmethod(@ModelAttribute("l")Emspojo e)
{
	System.out.println("delect");
	System.out.println(e.getEmpid());
	EmsImpl e1=new EmsImpl();
	e1.delete(e);
	return "redirect:/selectal";
}
@RequestMapping("/selectone")
public String selectonermethod()
{
	System.out.println("selectone");
	return "selectone";
}
@RequestMapping("/selectonecontrol")
public ModelAndView selectonecontrolmethod(@ModelAttribute("l")Emspojo e)
{
	System.out.println("selectonecontrol");
	
	EmsImpl e1=new EmsImpl();
	List<Emspojo>l=e1.selectoneall(e);
	System.out.println(e.getEmpid());
	return new ModelAndView("selectoneemp","slctone",l);
}
@RequestMapping("/deleteone")
public String deleteonermethod()
{
	System.out.println("deleteone");
	return "deleteone";
}
@RequestMapping("/deleteonecontrol")
public String deleteonecontrolmethod(@ModelAttribute("l")Emspojo e)
{
	System.out.println("deleteonecontrol");
	EmsImpl e1=new EmsImpl();
	e1.deleone(e);
	return "redirect:/selectal";
}

@RequestMapping("/backop")
public String backopmethod()
{
	System.out.println("backopone");
	return "index";
}
@RequestMapping("/newemp")
public String newempmethod()
{
	System.out.println("newemp");
	return "register";
}
}
