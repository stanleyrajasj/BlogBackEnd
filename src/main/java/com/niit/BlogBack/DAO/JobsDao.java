package com.niit.BlogBack.DAO;

import java.util.List;

import com.niit.BlogBack.model.Jobs;

public interface JobsDao {
public List<Jobs> list();
	
	public Jobs get(String job_Id);
	
	public void saveOrUpdate(Jobs comment);
		
	public void delete(String job_Id);
	
}
