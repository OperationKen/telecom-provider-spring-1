package com.home.user.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // this is an object to be managed by Hibernate

@Table(name = "telecom_provider_demo")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;

	@Column(name = "username")
	private String userName;

	private String device;

	@Column(name = "phonenumber")
	private String phoneNumber;

	@Column(name = "plan")
	private String phonePlan;

	public User() {
		super();
	}

	public User(String userName, String device, String phoneNumber, String plan) {
		super();
		this.userName = userName;
		this.device = device;
		this.phoneNumber = phoneNumber;
		this.phonePlan = plan;
	}

	public User(int id, String userName, String device, String phoneNumber, String plan) {
		super();
		this.id = id;
		this.userName = userName;
		this.device = device;
		this.phoneNumber = phoneNumber;
		this.phonePlan = plan;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return userName;
	}

	public void setName(String name) {
		this.userName = name;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPlan() {
		return phonePlan;
	}

	public void setPlan(String plan) {
		this.phonePlan = plan;
	}

}
