package com.asminds.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Arraylisttomapmain {
	public static void main(String[] args) {
		ArrayList<ArraylisttoMap> a=new ArrayList<>();
		a.add(new ArraylisttoMap(101,"sugan"));
		a.add(new ArraylisttoMap(102,"vasu"));
		//a.add(new ArraylisttoMap(103,"kavi"));
		//a.add(new ArraylisttoMap(104,"suja"));
		HashMap<Integer,String> hm=new HashMap<>();
		for(ArraylisttoMap m:a)
		{
			hm.put(m.getId(),m.getName());
		}                               
		System.out.println(hm);
		
/*		HashMap<Object,Object> hm=new HashMap<>();
		hm.put(101, "sugan");
		hm.put(102, "suja");
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+""+m.getValue());
		}
*/

		
	}
	

}
