package com.asminds.autowiring.bean;

public class Name {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Name(String name) {
		super();
		this.name = name;
	}

	public Name() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Name [name=" + name + "]";
	}
	void run()
	{
		System.out.println(" am in run method");
	}

}
