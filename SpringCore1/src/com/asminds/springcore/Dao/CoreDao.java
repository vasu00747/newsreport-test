package com.asminds.springcore.Dao;

import java.util.List;

import com.asminds.springcore.bean.Student1;

public interface CoreDao {
	public String insert(Student1 s);
	public List<Student1> select(Student1 s);

}
