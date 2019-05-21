package com.diana.prananyam;

public class B implements A {
	public void display()
	{
		System.out.println("hi");
	}
	public void show()
	{
		System.out.println("welcome");
	}
	public static void main(String[] args) {
		A a=new B();
		a.show();
	}

}
