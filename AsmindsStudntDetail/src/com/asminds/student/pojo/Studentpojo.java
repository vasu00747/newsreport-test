package com.asminds.student.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name=" STUDENTS")
public class Studentpojo {
  	@Id
	@GeneratedValue
	int id;
	@Column String username;
	String collegename;
	String deptname;
	int mobno;

	public Studentpojo()
	{
		
	}

	public Studentpojo(int id, String username, String collegename, String deptname, int mobno) {
		super();
		this.id = id;
		this.username = username;
		this.collegename = collegename;
		this.deptname = deptname;
		this.mobno = mobno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public int getMobno() {
		return mobno;
	}

	public void setMobno(int mobno) {
		this.mobno = mobno;
	}
	
	


	
	
	
}
