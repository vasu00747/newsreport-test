package com.asminds.interviewques.practice;

import java.util.ArrayList;

public class Arraylistprintusingforloop {
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		int len=al.size();
		int arr[]=new int[len];
		//al.toArray(al);
		//System.out.println("size is"+len);
/*		for(Integer i:al)
		{
			System.out.println("iteration value");
			System.out.println(i);
		}
*/		
		/*for(int i=0;i<len;i++)
		{
			System.out.println("for loop value");
			arr[i]=al.get(i);
			System.out.println(arr[i]);
		}*/
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i));
		}

}
	

}
