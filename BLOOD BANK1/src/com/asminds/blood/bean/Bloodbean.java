package com.asminds.blood.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Bloodbank")
public class Bloodbean {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String username;
	String password;
	String confirmpassword;
	String mailid;
	String donarname;
	String fathername;
	int age;
	String gender;
	String address;
	int pin;
	String district;
	String area;
	long phoneno;
	String bloodgroup;
	

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



	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}



	public String getConfirmpassword() {
		return confirmpassword;
	}




	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}



	public String getMailid() {
		return mailid;
	}




	public void setMailid(String mailid) {
		this.mailid = mailid;
	}



	public String getDonarname() {
		return donarname;
	}



	public void setDonarname(String donarname) {
		this.donarname = donarname;
	}




	public String getFathername() {
		return fathername;
	}


	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}




	public void setGender(String gender) {
		this.gender = gender;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public int getPin() {
		return pin;
	}




	public void setPin(int pin) {
		this.pin = pin;
	}




	public String getDistrict() {
		return district;
	}




	public void setDistrict(String district) {
		this.district = district;
	}




	public String getArea() {
		return area;
	}




	public void setArea(String area) {
		this.area = area;
	}




	public long getPhoneno() {
		return phoneno;
	}




	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}


	public String getBloodgroup() {
		return bloodgroup;
	}


	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}


	public Bloodbean(int id, String username, String password, String confirmpassword, String mailid, String donarname,
			String fathername, int age, String gender, String address, int pin, String district, String area,
			long phoneno, String bloodgroup) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.confirmpassword = confirmpassword;
		this.mailid = mailid;
		this.donarname = donarname;
		this.fathername = fathername;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.pin = pin;
		this.district = district;
		this.area = area;
		this.phoneno = phoneno;
		this.bloodgroup = bloodgroup;
	}


	public Bloodbean()
	{
		System.out.println("default constructor");
	}
	
	
	
	
	
	
	
	
	
		
	
}
