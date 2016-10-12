package com.niit.BlogBack.DAO;

import java.util.List;

import com.niit.BlogBack.model.User;

public interface UserDao {
public List<User> list();
	
	public User get(String user_Id);
	
	public void saveOrUpdate(User user);
		
	public void delete(String user_Id);

	public boolean isvaliduser(String name, String password, boolean b);

	public boolean isAdmin(String name, String password, boolean b);

	public User create(User user);

	public User update(Long id, User user);

}
