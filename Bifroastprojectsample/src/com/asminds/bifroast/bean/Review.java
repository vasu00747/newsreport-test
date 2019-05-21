package com.asminds.bifroast.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Review {
	@Id
	
	 int id;
	 String batchid;
	 String batchname;
	 int priority;
	 String status;
	 int delete;
      int invoice;
	 int charts;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBatchid() {
		return batchid;
	}
	public void setBatchid(String batchid) {
		this.batchid = batchid;
	}
	public String getBatchname() {
		return batchname;
	}
	public void setBatchname(String batchname) {
		this.batchname = batchname;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getDelete() {
		return delete;
	}
	public void setDelete(int delete) {
		this.delete = delete;
	}
	public int getInvoice() {
		return invoice;
	}
	public void setInvoice(int invoice) {
		this.invoice = invoice;
	}
	public int getCharts() {
		return charts;
	}
	public void setCharts(int charts) {
		this.charts = charts;
	}
	public Review(int id, String batchid, String batchname, int priority, String status, int delete, int invoice,
			int charts) {
		super();
		this.id = id;
		this.batchid = batchid;
		this.batchname = batchname;
		this.priority = priority;
		this.status = status;
		this.delete = delete;
		this.invoice = invoice;
		this.charts = charts;
	}
	public Review()
	{
		System.out.println("default constructor");
	}
	
	 
}
	
