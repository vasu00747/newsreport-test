package com.asminds.hyundai;

import javax.management.RuntimeErrorException;

public class Exceptionssample {
	public static void throwit()
	{
		System.out.println("throws");
		throw new RuntimeException();
	}
	public static void main(String[] args) {
		try{
			System.out.println("hello");
			throwit();
		}
		catch(Exception e)
		{
			System.out.println("caught");
		}
		finally
		{
			System.out.println("finally");
		}
	
		System.out.println("after");

}
}
