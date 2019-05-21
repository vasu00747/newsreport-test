package com.asminds.photo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Photographer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String name;
	String email;
	int mobileno;
	String qualification;
	String experience;
	String city;
	String stateprovince;
	String zippostalcode;
	String country;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobileno() {
		return mobileno;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStateprovince() {
		return stateprovince;
	}
	public void setStateprovince(String stateprovince) {
		this.stateprovince = stateprovince;
	}
	public String getZippostalcode() {
		return zippostalcode;
	}
	public void setZippostalcode(String zippostalcode) {
		this.zippostalcode = zippostalcode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Photographer(int id, String name, String email, int mobileno, String qualification, String experience,
			String city, String stateprovince, String zippostalcode, String country) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobileno = mobileno;
		this.qualification = qualification;
		this.experience = experience;
		this.city = city;
		this.stateprovince = stateprovince;
		this.zippostalcode = zippostalcode;
		this.country = country;
	}
	public Photographer()
	{
		
	}
	
	
	
	
	

}
