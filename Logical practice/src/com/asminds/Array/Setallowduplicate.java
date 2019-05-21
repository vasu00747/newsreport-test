package com.asminds.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Setallowduplicate {
	public static void main(String[] args) {
	Set<Setdeplicatebean>al=new HashSet();
	al.add(new Setdeplicatebean(100,"thanjavur"));
	al.add(new Setdeplicatebean(100,"trichy"));
	al.add(new Setdeplicatebean(100,"thanjavur"));
	Iterator itr=al.iterator();

while(itr.hasNext())
{	Setdeplicatebean o=(Setdeplicatebean)itr.next();
System.out.println(o);
	
		
	}
	}
}


