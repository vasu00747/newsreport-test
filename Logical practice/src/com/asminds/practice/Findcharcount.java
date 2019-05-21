package com.asminds.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Findcharcount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		
		ArrayList<Character>al=new ArrayList<>();
		for(int i=0;i<s.length();i++)
		{
			int count=1;
			if(al.contains(s.charAt(i)))
			{
				continue;
			}
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
                {
	               count++;
	               }
				
			}
			al.add(s.charAt(i));
			System.out.println(s.charAt(i)+ "  "+count);
		
		}
		
	}

}
