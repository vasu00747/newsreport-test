package com.asminds.student.registercontroller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.asminds.student.daoimplimtion.Studentimplimntiion;
import com.asminds.student.pojo.Studentpojo;
import com.asminds.student.pojo.Updtepojo;

@Controller
public class Studentcontroller {

  
           @RequestMapping("/log")
            public String sign(){
        	System.out.println("sign controller");
        	return "login";
           }
	
	 @RequestMapping("/empform")  
	    public String login() {  
		 
	      System.out.println(" Im in registration Controller");
	        return "empform";
	    }  

	 
	 @RequestMapping("/validatiion")  
	    public String validatiion(@ModelAttribute("t") Studentpojo login) {  
	      System.out.println(" Im in login valitation Controller");
	      
	      Studentimplimntiion s = new Studentimplimntiion();
	      s.insert(login);
	        return "redirect:/viewemp";
	    }
	 
	 
	 @RequestMapping("/viewemp")  
	    public ModelAndView EmpView() {  
	      System.out.println(" Im in logincheck");
	      
	      Studentimplimntiion s =new Studentimplimntiion();
	      System.out.println(" Going to get the emp");
	      List<Studentpojo> emp = s.getallStudentpojo();
	      //l.getAllEmployees();
	        return new ModelAndView("viewlist", "list", emp);
	 }
	 
	 
	 
	 
	 @RequestMapping(value="/deleteemp/{id}") 
	 
	    public ModelAndView delete(@PathVariable int id){
		 
		 Studentimplimntiion f = new Studentimplimntiion();
		 f.deleteEmployee(id);
		 
	//	 AdminLoginDAOImpl l = new AdminLoginDAOImpl();
		// l.deleteEmployee(id);
		 
	      return new ModelAndView("redirect:/viewemp");  
	    }
	 
		 @RequestMapping("/search")  
	    public String search() {  
	      System.out.println(" Im in registration Controller");
	        return "search";
	    }	 
	 
	 
	 @RequestMapping("/searchid")  
	    public String searchid(@ModelAttribute("t") Studentpojo id) {  
	      System.out.println(" Im in login valitation Controller");
	      
	      Studentimplimntiion s = new Studentimplimntiion();
	     s.searchid(id);
	        return "searchid";
	    }
 
	 
	 @RequestMapping("/update")
		public ModelAndView update(@ModelAttribute("update") Updtepojo update) {
			System.out.println(update.getBtn());
			System.out.println("I am in update controller");
			//Emsimpl upd =new Emsimpl();
			//List<RegistrationPojo> l = upd.updateDao(update);
			
			Studentimplimntiion upd=new Studentimplimntiion();
			
			List<Studentpojo> l=upd.updateDao(update);
			return new ModelAndView("updte", "update", l);
		}
	 
	 
		@RequestMapping("/UpdateController")
		public String UpdateController(@ModelAttribute("upd") Studentpojo updateemp) {
			System.out.println("I am in update stude controller");
			System.out.println(updateemp.getCollegename());
			
			//Emsimpl update =new Emsimpl();
			
			Studentimplimntiion update = new Studentimplimntiion();
			Boolean b = update.updateemployeeDao(updateemp);
			if(b==true) {
		        return "redirect:/viewemp";
			}else {
				return "searchid";	
			}
		}
		
}
