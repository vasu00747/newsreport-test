package com.asminds.ems.employeebeans;

import org.osgi.service.component.annotations.Component;

@Component
public class pojocls {
	
	
	public String nme;

	
	/**
	 * @return the nme
	 */
	public String getNme() {
		return nme;
	}

	/**
	 * @param nme the nme to set
	 */
	public void setNme(String nme) {
		this.nme = nme;
	}


	public pojocls(String nme) {
		super();
		this.nme = nme;
	}

	public pojocls() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public void dis(){
		System.out.println(nme);
	}
	
	
	
}
