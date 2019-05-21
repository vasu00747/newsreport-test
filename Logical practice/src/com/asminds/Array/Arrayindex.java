package com.asminds.Array;

import java.util.Scanner;

public class Arrayindex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
	
	}
		System.out.println("enter the index value");
		int c=sc.nextInt();
		

		for(int i=0;i<n;i++)
		{
			if(c==i)
			{
				System.out.println(a[i]);
				break;
			}
				}
		}

}
