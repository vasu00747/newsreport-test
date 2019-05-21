package com.asminds.hyundai;

public class Box {

	public static void main(String[] args) {
		int height;
		int length;
		int weight;
		//public class Mainclass{
		 Box b1=new Box();
		 Box b2=new Box();
		 b1.height=1;
		 b1.length=2;
		 b1.weight=1;
		 b2=b1;
		 System.out.println(b2.weight);
		 // this example display error because we cannot intialize the value
		 //to variable after obj creation also not assign to other obj;
		 
		} 
	}


