package com.asminds.Interview.banca;

public class Employe {
	int id;
	String name;
	Integer age;
	
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Employe(int id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public Employe(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Employe()
	{
		
	}
	

}
