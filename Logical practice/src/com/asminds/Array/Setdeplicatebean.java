package com.asminds.Array;

public class Setdeplicatebean {
	private int id;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Setdeplicatebean(int id, String address) {
		super();
		this.id = id;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Setdeplicatebean [id=" + id + ", address=" + address + "]";
	}
	

}
