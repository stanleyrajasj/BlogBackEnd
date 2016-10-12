package com.niit.BlogBack.DAO;

import java.util.List;

import com.niit.BlogBack.model.Blog;

public interface BlogDao {
public List<Blog> list();
	
	public Blog get(String blogName);
	
	public void saveOrUpdate(Blog blog);
		
	public void delete(String blogId);
}
