package com.niit.BlogBack.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;
@Entity
@Table(name = "blog")
@Component
public class Blog {
	
	@Id
	@Column(name="blogid")
	@GeneratedValue
	private String blog_Id;
	private String blog_Name;
	private String blog_title;
	private String blog_status;
	private String blog_message;
	public String getBlog_Id() {
		return blog_Id;
	}
	public void setBlog_Id(String blog_Id) {
		this.blog_Id = blog_Id;
	}
	public String getBlog_Name() {
		return blog_Name;
	}
	public void setBlog_Name(String blog_Name) {
		this.blog_Name = blog_Name;
	}
	public String getBlog_title() {
		return blog_title;
	}
	public void setBlog_title(String blog_title) {
		this.blog_title = blog_title;
	}
	public String getBlog_status() {
		return blog_status;
	}
	public void setBlog_status(String blog_status) {
		this.blog_status = blog_status;
	}
	public String getBlog_message() {
		return blog_message;
	}
	public void setBlog_message(String blog_message) {
		this.blog_message = blog_message;
	}
		
	
	
}
	
	






	
