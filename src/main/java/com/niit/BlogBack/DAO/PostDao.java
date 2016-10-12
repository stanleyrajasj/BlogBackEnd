package com.niit.BlogBack.DAO;

import java.util.List;

import com.niit.BlogBack.model.Post;

public interface PostDao {
public List<Post> list();
	
	public Post get(String userId);
	
	public void saveOrUpdate(Post comment);
		
	public void delete(String userId);
}
