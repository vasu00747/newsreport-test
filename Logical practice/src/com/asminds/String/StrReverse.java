
package com.asminds.String;

import java.util.Scanner;

public class StrReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String s=sc.nextLine();
		
		int l=s.length();
		System.out.println(l);
		
		for(int i=l-1; i>=0; i--)
		{
			System.out.print(s.charAt(i));
		}
		
	}

}
//second method
		/*char c[]=s1.toCharArray(); string to chararray
		for(int i=c.length-1;i>=0;i--)
		{
          System.out.println(c[i]);

		}*/

