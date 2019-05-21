package com.asminds.practice;

import java.util.Scanner;

public class Fibonaccinth {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s1=System.getProperty("Line.separator");
	System.out.println("enter the number");
	int num=sc.nextInt();
	int count=0;
	int x=0;
	int y=1;
	int sum;
	for(count=0;count<=num;count++)
	{
		System.out.println("" + x);
		sum=x+y;
		x=y;
		y=sum;
		
	}
	
	
	
	
	
	
}
}
