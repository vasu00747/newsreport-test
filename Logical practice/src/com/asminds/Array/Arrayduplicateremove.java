package com.asminds.Array;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrayduplicateremove {
	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		al.add("vasamalli");
		al.add("suganya");
		al.add("suganya");
		al.add("kavi");
		al.add("vasamalli");
		ArrayList<String>al1=new ArrayList<>();
		Iterator<String> itr=al.iterator();
	
		while(itr.hasNext())
		{
			String dup=itr.next();
			if(al1.contains(dup))
			{
				itr.remove();
					
			}
			else
			{
				al1.add(dup);
			}
		}
		
		
		System.out.println(al1);
	}
}
		

		


		
		
	



