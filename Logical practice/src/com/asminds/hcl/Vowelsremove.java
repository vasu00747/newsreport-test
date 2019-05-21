package com.asminds.hcl;

import java.util.Scanner;

public class Vowelsremove {
	public static void main(String[] args) {
		System.out.println("enter string");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=s1.replaceAll("[aeiouAEIOU]", "");
		System.out.println(s2);
		
	}

}
