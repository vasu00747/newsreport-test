package com.asminds.hyundai;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Sortmapvalue {
	public static void main(String[] args) {
		HashMap<String,Integer>hm=new HashMap<String,Integer>();
		hm.put("maths", 50);
		hm.put("science", 70);
		hm.put("physics", 60);
		Map<String,Integer>hm1=sortByValue(hm);
		for(Entry<String,Integer>hm2:hm1.entrySet())
		{
            System.out.println("Key = " + hm2.getKey() +  
                    ", Value = " + hm2.getValue()); 

		}
		
		

		
	}

	private static Map<String, Integer> sortByValue(HashMap<String, Integer> hm) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
