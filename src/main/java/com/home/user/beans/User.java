package com.home.user.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity // this is an object to be managed by Hibernate

@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int user_id;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;
	
	@OneToMany(mappedBy = "users")
	private Set<UserPlans> userPlans = new HashSet<>();

	public User() {
		super();
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<UserPlans> getUserPlans() {
		return userPlans;
	}

	public void setUserPlans(Set<UserPlans> userPlans) {
		this.userPlans = userPlans;
	}
	

}
