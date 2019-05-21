package com.asminds.Interview.banca;

import java.util.Scanner;

public class Bancaswap {
	
	public static void main(String[] args) {
		/*int a;
		int b;
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a, b");
		a=sc.nextInt();
		b=sc.nextInt();
				
		System.out.println("before swapping:" +a  +b);
		temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);*/
		int a;
		int b;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value for a");
		a=sc.nextInt();
		System.out.println("enter the value for b");
		b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping is A:"+a+" B:"+b);
		
		
			
			
		
	}
	

}
