package com.asminds.customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue
	int id;
	String name;
	String mailid;
	long mobileno;
	String designation;
	String area;
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
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Employee(int id, String name, String mailid, long mobileno, String designation, String area) {
		super();
		this.id = id;
		this.name = name;
		this.mailid = mailid;
		this.mobileno = mobileno;
		this.designation = designation;
		this.area = area;
	}
	public Employee()
	{
		System.out.println("am in default constructor");
	}
	

}
