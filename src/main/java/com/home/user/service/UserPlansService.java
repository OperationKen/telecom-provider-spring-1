package com.home.user.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.user.beans.User;
import com.home.user.beans.UserPlans;
import com.home.user.data.UserPlansRepository;
import com.home.user.data.UserRepository;

import antlr.collections.List;

@Service
public class UserPlansService {

	@Autowired
	UserPlansRepository repository;
	
	//Need to find a way to get UserID from User class
	
	
	//Create
	public UserPlans save(UserPlans userPlan) {
		return repository.save(userPlan);
	}

	//Retrieve
	public UserPlans findById(Integer id) {
		Optional<UserPlans> optional = repository.findById(id);
		return optional.isPresent() ? optional.get() : null;
	}
	
	//Update (not sure if right implementation)
	public UserPlans update(int userPlansId, UserPlans userPlan) {
		Optional<UserPlans> optional  = repository.findById(userPlansId);
		return optional.isPresent() ? optional.get() : null;
	}
	
	//Delete
	public void deleteUserPlans(int userPlansId) {
		repository.deleteById(userPlansId);
	}
	
}
