package com.niit.BlogBack.DAO;

import java.util.List;

import com.niit.BlogBack.model.Role;

public interface RoleDao {
public List<Role> list();
	
	public Role get(String role_id);
	
	public void saveOrUpdate(Role role_name);
		
	public void delete(String role_id);
}
