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
public class Jobs {
	@Id
	@Column(name="serialNo")
	@GeneratedValue
	private String job_Id;
	private String job_Name;
	private String company_Name;
	private String technologyExpected;
	private String location;
	private String adress;
	public String getJob_Id() {
		return job_Id;
	}
	public void setJob_Id(String job_Id) {
		this.job_Id = job_Id;
	}
	public String getJob_Name() {
		return job_Name;
	}
	public void setJob_Name(String job_Name) {
		this.job_Name = job_Name;
	}
	public String getCompany_Name() {
		return company_Name;
	}
	public void setCompany_Name(String company_Name) {
		this.company_Name = company_Name;
	}
	public String getTechnologyExpected() {
		return technologyExpected;
	}
	public void setTechnologyExpected(String technologyExpected) {
		this.technologyExpected = technologyExpected;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
}
	
