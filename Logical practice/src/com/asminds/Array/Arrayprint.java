package com.asminds.Array;

import java.util.Scanner;

public class Arrayprint {
	public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements in array");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("elements");
		//get total values from user so using for loop
		for(int j=0;j<n;j++)	
		{
		a[j]=sc.nextInt();
		}
		//int c=0;its for count
		//int a[]={1,2,3,4,5,6,10,11,3,4,5,6,6};
		//print
		for(int k=0;k<n;k++){
			System.out.println(a[k]);

		//c=c+a[k];
		}
		//System.out.println("total : "+c);

		
		
	}

}
