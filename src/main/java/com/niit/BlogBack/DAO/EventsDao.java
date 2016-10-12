package com.niit.BlogBack.DAO;

import java.util.List;

import com.niit.BlogBack.model.Events;

public interface EventsDao {

	public List<Events> list();
	
	public Events get(String event_Id);
	
	public void saveOrUpdate(Events event_Id);
		
	public void delete(String event_Id);
}
