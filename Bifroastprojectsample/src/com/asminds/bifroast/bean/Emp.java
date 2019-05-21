package com.asminds.bifroast.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {
	@Id
	
	private int id;
		private String username;
		private String password;
		
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
		
		public Emp(int id, String username, String password) {
			super();
			this.id = id;
			this.username = username;
			this.password = password;
		}
		public Emp()
		{
			System.out.println("am in default constructor");
		}
		
		
		

	}



