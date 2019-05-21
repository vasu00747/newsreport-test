package com.asminds.SpoorsDAO;

import java.util.List;

import com.asminds.Spoors.Pojo.CustomerPojo;

public interface SpoorsDAO {
	
	
	public boolean insert(CustomerPojo p);
	public List<CustomerPojo> select(CustomerPojo p);
	public boolean delete(CustomerPojo p);
	public List<CustomerPojo> Selectone(CustomerPojo p);
	public boolean UpdateAll(CustomerPojo p);
	
	
	

}
