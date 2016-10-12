package com.niit.BlogBack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "chat")
@Component
public class Chat {
	@Id
	@Column(name="serialNo")
	@GeneratedValue

	private String chat_Id;
	private String serialNo;
	private String sender;
	private String resever;
	private String message;
	public String getChat_Id() {
		return chat_Id;
	}
	public void setChat_Id(String chat_Id) {
		this.chat_Id = chat_Id;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getResever() {
		return resever;
	}
	public void setResever(String resever) {
		this.resever = resever;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
}
