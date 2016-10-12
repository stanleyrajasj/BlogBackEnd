package com.niit.BlogBack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;
@Entity
@Table(name = "Events")
@Component
public class Events {
	@Id
	@Column(name="event_Id")
	@GeneratedValue
	private String event_Id;
	private String event_Name;
	private String event_content;
	public String getEventId(){
		return event_Id;
	}
	public String getEvent_Id() {
		return event_Id;
	}
	public void setEvent_Id(String event_Id) {
		this.event_Id = event_Id;
	}
	public String getEvent_Name() {
		return event_Name;
	}
	public void setEvent_Name(String event_Name) {
		this.event_Name = event_Name;
	}
	public String getEvent_content() {
		return event_content;
	}
	public void setEvent_content(String event_content) {
		this.event_content = event_content;
	}
	
}
