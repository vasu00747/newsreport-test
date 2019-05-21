package com.asminds.interviewques.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mapprintlocation {
	public static void main(String[] args) {
		
		
		HashMap<Integer,Mapemployee>hm=new HashMap<>();
		hm.put(1, new Mapemployee(101,"arivazhagan","thanjavur"));
		hm.put(2, new Mapemployee(102,"sujatha","thanjavur"));
		hm.put(3, new Mapemployee(103,"suganya","trichy"));
		hm.put(4, new Mapemployee(104,"diana","trichy"));
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the location");
		String loc=sc.nextLine();

		for(Map.Entry<Integer,Mapemployee>m:hm.entrySet())
		{
			if(m.getValue().getAddress().equals(loc))
			{
				System.out.println(m.getKey()+ " " +m.getValue());
			}
		}

		
	}

}
