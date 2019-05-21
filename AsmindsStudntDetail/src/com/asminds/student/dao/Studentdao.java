package com.asminds.student.dao;

import java.util.List;

import com.asminds.student.pojo.Studentpojo;
import com.asminds.student.pojo.Updtepojo;

public interface Studentdao {
	
	
	public void insert(Studentpojo login  );
	
    public List<Studentpojo> getallStudentpojo();
    
    public void deleteEmployee(Integer Studentpojoid);
    
    public String searchid(Studentpojo id);
    
    public List<Studentpojo> updateDao(Updtepojo update);
}
