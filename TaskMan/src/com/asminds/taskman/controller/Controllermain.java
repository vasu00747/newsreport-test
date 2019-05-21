package com.asminds.taskman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asminds.taskman.Daoimpl.Clientimpl;
import com.asminds.taskman.bean.Client;
import com.asminds.taskman.bean.Employ;

@Controller
public class Controllermain {
	@RequestMapping("/")
	public String index()
	{
		return"index";
	}
	@RequestMapping("/login")
	public String login()
	{
		System.out.println("login method");
		return "login";
	}
	@RequestMapping("/valid")
	public String valid()
	{
		System.out.println("valid method");
		return "home";
	}
	@RequestMapping("/adm")
	public String admins()
	{
		System.out.println("admin method");
		return "admin";
		
	}
	@RequestMapping("/clientdetails")
	public String client()
	{
		System.out.println("clientt method");
		return "client";
	}
	@RequestMapping("/newc")
	public String newc()
	{
		System.out.println("new method");
		return "client";
	}
	@RequestMapping("/validd")
	public String validatee(@ModelAttribute("z")Client c,Employ e)
	{
		String name=c.getName();
		String site=e.getSite();
		System.out.println("name" +name);

		System.out.println("site" +site);

		System.out.println("validation method");
		Clientimpl t=new Clientimpl();	
	     t.insertc(c);
		t.insertemp(e);
		return "sucess";
	}
	




}
