package com.asminds.versioning;

import javax.persistence.Id;

public class Agents {
	private int aid;
	private String aname;
	private String location;
	private int v;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getV() {
		return v;
	}
	public void setV(int v) {
		this.v = v;
	}
	public Agents(int aid, String aname, String location) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.location = location;
		
	}
	
	public Agents()
	{
		
	}
	
}
	
