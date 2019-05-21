package com.asminds.practice;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		String s1="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string or number");
		String s2=sc.nextLine();
		int len=s2.length();
		for(int i=len-1;i>=0;i--)
		
			s1=s1+s2.charAt(i);
			
		if(s2.equals(s1))
		{
			System.out.println("this is palindrome");
		}
		else
		{
			System.out.println("this not a palindrome");
		}
		
		
	}

}
