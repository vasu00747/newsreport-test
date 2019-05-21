package com.asminds.udsems.pojoclass;

import javax.persistence.Entity;

@Entity
public class Emspojo {
@Id
private int empid;
private String name;
private String mobileno;
private String address;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobileno() {
	return mobileno;
}
public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Emspojo(int empid, String name, String mobileno, String address) {
	super();
	this.empid = empid;
	this.name = name;
	this.mobileno = mobileno;
	this.address = address;
}
public Emspojo()
{
	
}
}
