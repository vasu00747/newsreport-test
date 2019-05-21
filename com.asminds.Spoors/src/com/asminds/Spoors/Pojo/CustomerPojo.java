package com.asminds.Spoors.Pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity


public class CustomerPojo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int cus;
	
	private String name;
	
	private String invoice;
	
	private String shipping;
	
	private String sex;
	
	private String company;
	
	private String district;
	
	private String email;
	
	private int mobile;
	
	public CustomerPojo()
	{
		System.out.println("i am default Contructor");
	}

	public CustomerPojo(int cus, String name, String invoice, String shipping, String sex, String company,
			String district, String email, int mobile) {
		super();
		this.cus = cus;
		this.name = name;
		this.invoice = invoice;
		this.shipping = shipping;
		this.sex = sex;
		this.company = company;
		this.district = district;
		this.email = email;
		this.mobile = mobile;
	}

	public int getCus() {
		return cus;
	}

	public void setCus(int cus) {
		this.cus = cus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInvoice() {
		return invoice;
	}

	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}

	public String getShipping() {
		return shipping;
	}

	public void setShipping(String shipping) {
		this.shipping = shipping;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "CustomerPojo [cus=" + cus + ", name=" + name + ", invoice=" + invoice + ", shipping=" + shipping
				+ ", sex=" + sex + ", company=" + company + ", district=" + district + ", email=" + email + ", mobile="
				+ mobile + "]";
	}

	
	


}
