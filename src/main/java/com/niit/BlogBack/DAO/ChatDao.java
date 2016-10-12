package com.niit.BlogBack.DAO;

import java.util.List;

import com.niit.BlogBack.DAO.*;
import com.niit.BlogBack.model.Chat;


public interface ChatDao {
public List<Chat> list();
	
	public Chat get(String sender);
	
	public void saveOrUpdate(Chat chat);
		
	public void delete(String sender);

}
