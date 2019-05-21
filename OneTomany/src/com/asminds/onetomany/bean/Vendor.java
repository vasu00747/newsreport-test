package com.asminds.onetomany.bean;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Vendor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int vid;
	private String vname;
	private Set children;
	
	@OneToMany(fetch=FetchType.LAZY,targetEntity=Customerr.class,cascade=CascadeType.ALL)
	@JoinColumn(name="venid",referencedColumnName="vid")
	public Set getChildren() {
		return children;
	}
	public void setChildren(Set children) {
		this.children = children;
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public Vendor(int vid, String vname) {
		super();
		this.vid = vid;
		this.vname = vname;
	}

}
