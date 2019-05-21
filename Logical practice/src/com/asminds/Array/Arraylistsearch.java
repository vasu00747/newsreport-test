package com.asminds.Array;

import java.util.ArrayList;

public class Arraylistsearch {
	public static void main(String[] args) {
		ArrayList<String>l=new ArrayList<String>();
		l.add("vasu");
		l.add("malli");
		l.add(2, "vasamalli");
		l.add("suganya");
		l.add("gayu");
		for(String l1:l)
		{
			System.out.println(l1);
		}
		if(l.contains("malli"))
		{
			System.out.println("yes");
			//System.out.println(l.indexOf(l));
		}
		else
		{
			System.out.println("no");
		}

		
		
	}

}
