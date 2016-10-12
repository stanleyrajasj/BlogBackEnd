package com.niit.BlogBack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="SerialNo")
@Component
public class Post {
	@Id
	@Column(name="serialNo")
	@GeneratedValue  
	
	private String chat_Id;
	private String user_id;
	private String post;
	private String share;
	private String like;     
	private String comment;
	
	
	public String getChat_Id() {
		return chat_Id;
	}
	public void setChat_Id(String chat_Id) {
		this.chat_Id = chat_Id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getShare() {
		return share;
	}
	public void setShare(String share) {
		this.share = share;
	}
	public String getLike() {
		return like;
	}
	public void setLike(String like) {
		this.like = like;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	}

