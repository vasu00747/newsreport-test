package com.asminds.Array;

import java.util.Scanner;

public class Arrayreverse {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of array elements");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=n-1;j>=0;j--)
		{
			System.out.println(a[j]);	
		}
		
		    
		
	}

}
