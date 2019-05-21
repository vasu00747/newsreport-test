package com.asminds.ems.employeebeans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	int nme;
	
	
	@Autowired

	address add;


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the nme
	 */
	public int getNme() {
		return nme;
	}


	/**
	 * @param nme the nme to set
	 */
	public void setNme(int nme) {
		this.nme = nme;
	}


	/**
	 * @return the add
	 */
	public address getAdd() {
		return add;
	}


	/**
	 * @param add the add to set
	 */
	public void setAdd(address add) {
		this.add = add;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [nme=" + nme + ", add=" + add + "]";
	}
	void ply(){
		System.out.println("fd");
	}
	
	

}
