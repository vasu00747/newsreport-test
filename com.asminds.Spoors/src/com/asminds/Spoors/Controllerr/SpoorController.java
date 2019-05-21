package com.asminds.Spoors.Controllerr;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.asminds.Spoors.Pojo.CustomerPojo;
import com.asminds.SpoorsDAOIpml.SpoorsDAOImpl;

@Controller
public class SpoorController {
	@RequestMapping("/")
	public String Display()
	{
		System.out.println("index");
		return "index";
	}
	
   @RequestMapping("/home")
   public String Home()
   {
	   System.out.println("home");
	   return "home";
   }
   @Qualifier
   @RequestMapping("/customer")
   public String customer()
   {
	   System.out.println("customer");
	   return "cus_view";
   }
   @RequestMapping("/insertcontrol")
   public String insertcontrol(@ModelAttribute("m")CustomerPojo p)
   {
	   System.out.println("insertcontrol");
	   SpoorsDAOImpl s=new SpoorsDAOImpl();
	   s.insert(p);
	   return "createcus";
   }
   @RequestMapping("/cus_view")
   public String cus_view()
   {
	   System.out.println("cus_view");
	   return "home";
   }
   
   @RequestMapping("/selectCustomer")
   public ModelAndView selectmethod(@ModelAttribute("k")CustomerPojo p)
   {
   	System.out.println("selectCustomer");
   	SpoorsDAOImpl s = new SpoorsDAOImpl();
   	List<CustomerPojo>l=s.select(p);
   	System.out.println("select data are");
   	return new ModelAndView("select","slc",l);
   }
   
   
   @RequestMapping("/deletecustomer")
   public String deletecustomer()
   {
	   System.out.println("deletecustomer");
	   return "delete";
   }
   
   @RequestMapping("/editcustomer")
   public String editcustomer()
   {
	   System.out.println("editcustomer");
	   return "edit";
   }
   
   @RequestMapping("/selectonecus")
   public String selectonecus()
   {
	   System.out.println("selectoneCustomer");
	   return "seelctone";
   }
   
   @RequestMapping("/deleteController")
   public String deleteController(@ModelAttribute("1")CustomerPojo p)
   {
	   System.out.println("deelted");
	   SpoorsDAOImpl s = new SpoorsDAOImpl();
	   s.delete(p);
	   return "cus_view";
   }
  @RequestMapping("/editControl")
  public ModelAndView editController(@ModelAttribute("k")CustomerPojo p)
  {
	  System.out.println("hiii");
	  System.out.println(p.getCus());
	  SpoorsDAOImpl s  = new SpoorsDAOImpl();
	  List<CustomerPojo> l = s.Selectone(p);
	  System.out.println("editcon");
	  return new ModelAndView("edit","ed",l);
  }
  @RequestMapping("/editConData")
  public String editConData(@ModelAttribute("1")CustomerPojo p)
  {
	  System.out.println("Updated Successfully");
	  SpoorsDAOImpl s  = new SpoorsDAOImpl();
	  s.UpdateAll(p);
	  return "cus_view";
  }

}
