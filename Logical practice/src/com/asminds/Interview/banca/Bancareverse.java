package com.asminds.Interview.banca;

import java.util.Scanner;

public class Bancareverse {
	public static void main(String[] args) {
		//String s1="vasamalli";
	/*	1) method
		String s1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		s1=sc.nextLine();
		StringBuilder sb=new StringBuilder();
		sb.append(s1);
		sb=sb.reverse();
		System.out.println(sb);*/
		
		/*String s;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string");
		s=sc.nextLine();
	int len=s.length();
	System.out.println(len);
	while(len>0)
	{
		len--;
		char c=s.charAt(len);
		System.out.println(c);
	}*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s1=sc.nextLine();
		String s2="";
		int len=s1.length();
		System.out.println(len);
		//char ch=s1.charAt(len);
		//System.out.println(ch);
		for(int i=len-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
			//System.out.println(s2);used to reverse extra one char(previous char) to add in reverse

		}
		System.out.println(s2);
		}

}
