package com.niit.BlogBack.DAO;

import java.util.List;

import com.niit.BlogBack.model.FriendList;

public interface FriendListDao {
public List<FriendList> list();
	
	public FriendList get(String friend_id);
	
	public void saveOrUpdate(FriendList Friendlist);
		
	public void delete(String friend_id);
}
