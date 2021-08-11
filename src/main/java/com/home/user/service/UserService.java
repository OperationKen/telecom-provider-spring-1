package com.home.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.user.beans.User;
import com.home.user.data.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	// ------- FIND ALL -----
	public List<User> findAll() {
		return repository.findAll();
	}

	// ------- ADD ----------
	public User save(User user) {
		return repository.save(user);
	}

	// ------- FIND BY ID ------
	public User findById(Integer id) {
		Optional<User> optional = repository.findById(id);
		return optional.isPresent() ? optional.get() : null;
	}

	// ------- FIND BY USER NAME ------
	public List<User> findByUserName(String name) {
		List<User> optional = repository.findByUserName(name);
//		return optional.get(0);
		return optional;
	}

	// ------- DELETE USER BY ID------
	public void deleteUserById(Integer id) {
		repository.deleteById(id);
	}

	// ------- GET COUNT BY USER NAME ------
	public Integer entriesByUserName(String name) {
		return repository.entriesByUserName(name);
	}

	// ------- GET PLANS BY USER NAME ------
	public List<String> plansByUserName(String name) {
		return repository.getPlansByUserName(name);
	}

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
