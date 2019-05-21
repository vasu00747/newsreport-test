package com.asminds.interviewques.practice;

public class Mapemployee {
	int id;
	String name;
	String address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Mapemployee(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public Mapemployee()
	{
		
	}
	@Override
	public String toString() {
		return "Mapemployee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
