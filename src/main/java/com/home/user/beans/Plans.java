package com.home.user.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Plans {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "plan_id")
	private int plan_id;

	@Column(name = "max_devices")
	private int maxDevices;

	@Column(name = "plan_cost")
	private int cost;
	
	@JsonIgnore
	@OneToMany(mappedBy = "plans", cascade = CascadeType.ALL)
	private Set<UserPlans> userPlans = new HashSet<>();

	public Plans() {
		super();
	}
	
	public int getPlan_id() {
		return plan_id;
	}

	public void setPlan_id(int plan_id) {
		this.plan_id = plan_id;
	}

	public int getMaxDevices() {
		return maxDevices;
	}

	public void setMaxDevices(int maxDevices) {
		this.maxDevices = maxDevices;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Set<UserPlans> getUserPlans() {
		return userPlans;
	}

	public void setUserPlans(Set<UserPlans> userPlans) {
		this.userPlans = userPlans;
	}
	
}