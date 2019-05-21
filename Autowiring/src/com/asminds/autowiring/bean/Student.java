package com.asminds.autowiring.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	int id;
	@Autowired
	String name;
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
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	void display()
	
	{
		
		System.out.println("display method in student class");
		
	}
	

}
