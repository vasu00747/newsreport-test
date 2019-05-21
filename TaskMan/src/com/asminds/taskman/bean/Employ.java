package com.asminds.taskman.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Employ {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	int id;
	String site;
	String emptype;
	
	@OneToMany(mappedBy="e",targetEntity= Client.class)
	List<Client> c=new ArrayList<>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getEmptype() {
		return emptype;
	}
	public void setEmptype(String emptype) {
		this.emptype = emptype;
	}
	
	public Employ(String site, String emptype) {
		super();
		this.site = site;
		this.emptype = emptype;
	}
	public Employ()
	{
		System.out.println("in employy constructor");
	}

}
