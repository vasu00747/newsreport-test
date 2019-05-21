package com.asminds.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArraylistReadonly {
	public static void main(String[] args) {
/*		ArrayList<Object>al=new ArrayList<>();
		al.add(101);
		al.add("vasu");
		al.add(101.50);
		al.add(123.46567);
		//Collections.unmodifiableList(al);
		al.add(2,"malli");
		for(Object kk:al)
		{
			System.out.println(kk);
		}
		*/
		
/*		Iterator itr=(Iterator)al.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

*/	
		List<String>al=new ArrayList<>();
		al.add("kavi");
		List<String>al1=Collections.unmodifiableList(al);
		al.add("maki");
		for(String k1:al)
		{
	System.out.println(k1);
		}
	
	}
	}

	

