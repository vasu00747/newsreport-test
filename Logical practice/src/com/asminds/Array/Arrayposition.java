package com.asminds.Array;

import java.util.Scanner;

public class Arrayposition {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter  array elements");
		int n=sc.nextInt();

		int a[]=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter position");
		int c=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(c==i)
			{
				System.out.println(a[i-1]);
				//break;
			}
		}
		
		
		
		
		
		
		
		
	}

}
