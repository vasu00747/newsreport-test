package com.asminds.blood.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asminds.blood.Daoimpl.Blooddaoimpl;
import com.asminds.blood.bean.Bloodbean;

@Controller
public class Bloodcontroller {
	@RequestMapping("/")
	public String homepage()
	{
		System.out.println("home page");
		return"home";
	}
	@RequestMapping("/donarregister")
	public String register()
	{
		System.out.println("registeration page");
		return"donarregis";
	}
   @RequestMapping("/registeration")
	public String regissave(@ModelAttribute ("m") Bloodbean b)
	{
		System.out.println("registeration save ");
		Blooddaoimpl i=new Blooddaoimpl();
		i.insert(b);
		System.out.println(b.getDonarname());
		System.out.println(b.getGender());

		return"login";
	}
   @RequestMapping("/login")
   public String loginn()
   {
	   System.out.println("login page");
	   return"loginsucess";
   }
   @RequestMapping("/editprofile")
   public String edit()
   {
	   System.out.println("edit page");
	   return"edit";
   }
   @RequestMapping("/editedd")
   public String update()
   {
	   System.out.println("update page");
	   return"loginsucess";
   }
   @RequestMapping("/changepassword")
   public String changepassword()
   {
	   System.out.println("changepassword page");
	   return"changepassword";
   }
   @RequestMapping("/changee")
   public String changepasswordlogin()
   {
	   System.out.println("changepassword afterlogin page");
	   return"login";
   }
   @RequestMapping("/search")
   public String search()
   {
	   System.out.println("search page");
	   return"search";
   }
   @RequestMapping("/searr")
   public String searchdisplay()
   {
	   System.out.println("searchdisplay page");
	   return"display";
   }
	

}
