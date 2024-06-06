package com.ibm.ecms.dto;

import java.util.Date;

public class CustomerDto {
	private int customer_id;
	private String email_id;
	private String name;
	private Date date_of_birth;
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	@Override
	public String toString() {
		return "CustomerDto [customer_id=" + customer_id + ", email_id=" + email_id + ", name=" + name
				+ ", date_of_birth=" + date_of_birth + "]";
	}
	
	

}
