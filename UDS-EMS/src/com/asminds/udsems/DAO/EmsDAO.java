package com.asminds.udsems.DAO;

import java.util.List;

import com.asminds.udsems.pojoclass.Emspojo;

public interface EmsDAO {
	public boolean insert(Emspojo e);
	public List<Emspojo> select(Emspojo e);
	public List<Emspojo>updateview(Emspojo e);
	public boolean updateall(Emspojo e);
	public boolean delete(Emspojo e); 
	public List<Emspojo> selectoneall(Emspojo e);
	public String deleone(Emspojo e);
}
