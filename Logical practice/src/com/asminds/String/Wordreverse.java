
package com.asminds.String;

import java.util.Scanner;

public class Wordreverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the strings");
		String s1=sc.nextLine();
		String[] s=s1.split(" "); 
		System.out.println("Split value");
 for(String st:s)	
 {
	System.out.println(st);
	//System.out.println(st.length());
 }
 System.out.println("Reverse word");
 for(int i=s.length-1; i>=0; i--)
 {
	 System.out.println(s[i]);
 }
 
 //System.out.println("Reverse char  starting from reverse pana word first :");
 for(int i=0;i<s.length;i++)
 {
	 for(int j=s[i].length()-1; j>=0;j--)
	 {
		System.out.print(s[i].charAt(j)); 
	 } 
	 System.out.println();
 }
 System.out.println("Reverse char from last word :");
 for(int i=s.length-1;i>=0;i--)
 {
	 for(int j=s[i].length()-1; j>=0;j--)
	 {
		 System.out.print(s[i].charAt(j));
	 }
	 
	 
	 System.out.println();
 }
 
 
 
		
		
	}

}
