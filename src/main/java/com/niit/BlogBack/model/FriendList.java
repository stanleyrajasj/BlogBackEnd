package com.niit.BlogBack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Table(name="Friendlist")
@Component
public class FriendList {
	@Id
	@Column(name="serialNo")
	@GeneratedValue 
	
	private String friend_id;
	private String friend_Name;
	private String user_id;
	private String email_id;
	private String phone_no;
	public String getFriend_id() {
		return friend_id;
	}
	public void setFriend_id(String friend_id) {
		this.friend_id = friend_id;
	}
	public String getFriend_Name() {
		return friend_Name;
	}
	public void setFriend_Name(String friend_Name) {
		this.friend_Name = friend_Name;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	

}