package com.home.user.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
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
import com.fasterxml.jackson.annotation.JsonManagedReference;

public class UserPlans {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userplan_id")
	private int userplan_id;

	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "user_info_user_id", referencedColumnName = "user_id")
	private User user;

	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "plans_plan_id", referencedColumnName = "plan_id")
	private Plans plans;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "userPlans", cascade = CascadeType.ALL)
	private Set<PhoneInfo> phoneInfo;

	public UserPlans() {
		super();
	}
	
	
	public int getUserplan_id() {
		return userplan_id;
	}

	public void setUserplan_id(int userplan_id) {
		this.userplan_id = userplan_id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Plans getPlans() {
		return plans;
	}

	public void setPlans(Plans plans) {
		this.plans = plans;
	}

	public Set<PhoneInfo> getPhoneInfo() {
		return phoneInfo;
	}

	public void setPhoneInfo(Set<PhoneInfo> phoneInfo) {
		this.phoneInfo = phoneInfo;
	}
	
	
}
