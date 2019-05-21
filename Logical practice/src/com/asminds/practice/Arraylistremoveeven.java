package com.asminds.practice;

import java.util.ArrayList;

public class Arraylistremoveeven {
	public static void main(String[] args) {
		ArrayList<Integer>l=new ArrayList<>();
		ArrayList<Integer>l1=new ArrayList<>();

		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(2);

		for(Integer al:l)
		{
			if(l1.contains(al)!=true)
			{
			if(al%2==0)
			{
				l1.add(al);
			}
			
		}
		}
		System.out.println("after removing even");
		for(Integer re:l1)
		{
			System.out.println(re);
		}

		
	}

}
