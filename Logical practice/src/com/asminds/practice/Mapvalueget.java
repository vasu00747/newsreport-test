package com.asminds.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mapvalueget {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1, "sugan");
		hm.put(2, "arivu");
		hm.put(3, "suja");
		hm.put(4, "vasu");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the key");
		int key=sc.nextInt();
		for(Map.Entry<Integer,String>m:hm.entrySet())
		{
			if(m.getKey()==key)
			{
				System.out.println(m.getValue());
			}
		}

	}

}
