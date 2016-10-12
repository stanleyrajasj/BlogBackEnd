package com.niit.BlogBack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "user")
@Component
public class User {
	
	@Id
	@Column
	@GeneratedValue
	private int user_id;
	private String userName;
	private String type_of_user;
	private String email_id;
	private String phone_no;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int id) {
		this.user_id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getType_of_user() {
		return type_of_user;
	}
	public void setType_of_user(String type_of_user) {
		this.type_of_user = type_of_user;
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
	
	