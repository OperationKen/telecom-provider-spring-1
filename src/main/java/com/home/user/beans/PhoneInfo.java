package com.home.user.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
public class PhoneInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "phone_id")
	private int phone_id;

	@Column(name = "phone_name")
	private String phoneName;

	@Column(name = "phone_number")
	private String phoneNumber;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "userplans_userplan_id")
	private UserPlans userPlans;

	public PhoneInfo() {
		super();
	}
	
	public int getPhone_id() {
		return phone_id;
	}

	public void setPhone_id(int phone_id) {
		this.phone_id = phone_id;
	}

	public String getPhoneName() {
		return phoneName;
	}

	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public UserPlans getUserPlans() {
		return userPlans;
	}

	public void setUserPlans(UserPlans userPlans) {
		this.userPlans = userPlans;
	}
	
	
}
