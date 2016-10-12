package com.niit.BlogBack.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "role")
@Component
public class Role {
private String role_id;
private String role_name;

public Role() {
	super();
}
public Role(String role_id, String role_name) {
	super();
	this.role_id = role_id;
	this.role_name = role_name;
}
public String getRole_id() {
	return role_id;
}
public void setRole_id(String role_id) {
	this.role_id = role_id;
}
public String getRole_name() {
	return role_name;
}
public void setRole_name(String role_name) {
	this.role_name = role_name;
}
}
