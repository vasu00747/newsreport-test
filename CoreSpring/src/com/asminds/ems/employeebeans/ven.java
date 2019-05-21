package com.asminds.ems.employeebeans;

public class ven {
	
	int ddress;

	public ven(int ddress) {
		super();
		this.ddress = ddress;
	}

	public ven() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the ddress
	 */
	public int getDdress() {
		return ddress;
	}

	/**
	 * @param ddress the ddress to set
	 */
	public void setDdress(int ddress) {
		this.ddress = ddress;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ven [ddress=" + ddress + "]";
	}
	
	
void siply(){
	System.out.println("ddress");
}
}
