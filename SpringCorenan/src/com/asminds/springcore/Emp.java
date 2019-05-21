package com.asminds.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component

public class Emp {
	@Autowired
	Customerr customerr;
	void details()
	{
		System.out.println("asminds technology" +customerr);
	}
	

}
