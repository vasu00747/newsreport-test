package com.asminds.criteria.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="products1")
public class Productss {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	int pid;
	String pname;
	double price;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}

	
	public double getprice() {
		return price;
	}
	public void setprice(double price) {
		this.price = price;
	}
	
	public Productss(int pid, String pname, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	public Productss()
	{
		System.out.println("-------");
	}

}
