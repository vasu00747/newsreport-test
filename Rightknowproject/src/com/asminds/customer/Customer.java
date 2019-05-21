	package com.asminds.customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;

@Entity
public class Customer {
	@Id
	@GeneratedValue
	int id;
	int uniqueid;
	String name;
	String location;
	int pincode;
	int mobileno;
	String mailid;
	String devicename;
	String idproof;
	
	
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
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public int getMobileno() {
		return mobileno;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getDevicename() {
		return devicename;
	}
	public void setDevicename(String devicename) {
		this.devicename = devicename;
	}
	public String getIdproof() {
		return idproof;
	}
	public void setIdproof(String idproof) {
		this.idproof = idproof;
	}
	public int getUniqueid() {
		return uniqueid;
	}
	public void setUniqueid(int uniqueid) {
		this.uniqueid = uniqueid;
	}

	public Customer(int id, int uniqueid, String name, String location, int pincode, int mobileno, String mailid,
			String devicename, String idproof) {
		super();
		this.id = id;
		this.uniqueid = uniqueid;
		this.name = name;
		this.location = location;
		this.pincode = pincode;
		this.mobileno = mobileno;
		this.mailid = mailid;
		this.devicename = devicename;
		this.idproof = idproof;
	}
	public Customer()
	{
		System.out.println("default constructor");
	}
	
	
	
	
	
	
	
	

}
