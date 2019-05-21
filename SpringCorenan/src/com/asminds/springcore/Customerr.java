package com.asminds.springcore;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component
public class Customerr {
	int id;
	String name;
	String location;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Customerr(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	public Customerr()
	{
		
	}
	public String toString() {
		return "Customerr [id=" + id + ", name=" + name + ", location=" + location + "]";
	}

}
