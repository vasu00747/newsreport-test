package com.asminds.Array;

import java.util.Scanner;

public class Reversenumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		long a=sc.nextLong();
		while(a>0)
		{
			long r=a%10;
			 a=a/10;
			System.out.println(r);
			
		}
		
		
		
	}

}
