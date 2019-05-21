package com.asminds.Interview.banca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Employemain {
	public static void main(String[] args) {
		HashMap<Integer, Employe> hm = new HashMap<>();
		hm.put(1, new Employe(11, "kavi", 28));
		hm.put(2, new Employe(12, "vasu", 24));
		hm.put(3, new Employe(13, "maki", 25));
		hm.put(4, new Employe(14, "malar",26));
		
		for (Map.Entry<Integer, Employe> e : hm.entrySet()) {
			Employe emp = e.getValue();
			System.out.println(e.getValue());
			if(emp.getAge() > 25){
				System.out.println(e.getKey());
				System.out.println(emp.getId());
				System.out.println(emp.getName());
			}
		}

         
	}

}
