package com.asminds.Dao;


import java.util.List;

import com.asminds.customer.Customer;

public interface Dao {
	public String insert(Customer c);
	public   List<Customer>selected(Customer c);
	public List<Customer> updatese(Customer c);
	public Boolean update(Customer c);
	public Boolean delete(Customer c);
	public List<Customer> selectoneall(Customer c);



	

}
