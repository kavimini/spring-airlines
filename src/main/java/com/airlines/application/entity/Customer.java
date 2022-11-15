package com.airlines.application.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	
	
	@Id
	private long customerId;
	
	private String name;
	
	private String address;
	
	private String mobileNumber;

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", address=" + address + ", mobileNumber="
				+ mobileNumber + "]";
	}
	
	
	

}
