package com.home.user.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.user.beans.User;
import com.home.user.service.UserService;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class UserController {

	@Autowired
	private UserService service;

	// ----- FIND ALL --------
	@GetMapping(value = "/user")
	public ResponseEntity<List<User>> findAll() {
		return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
	}

	// ------- ADD USER -----
	@PostMapping(value = "/user")
	public ResponseEntity<User> save(@RequestBody @Valid User user) {
		User body = service.save(user);
		return new ResponseEntity<>(body, HttpStatus.CREATED);
	}
	
	
	// ------ FIND BY ID -----
	@GetMapping("/user/{id}")
	public ResponseEntity<User> findById(@PathVariable("id") Integer id) {
		return new ResponseEntity<>(service.findById(id), HttpStatus.OK);

	}

	// ------ FIND BY USER NAME -----
	// localhost:8080/users/user/name=Verla Peert
	@GetMapping("/user/name/{nameOfUser}")
	public ResponseEntity<User> findByUserName(@PathVariable("nameOfUser") String name) {
		return new ResponseEntity<>(service.findByUserName(name), HttpStatus.OK);
	}

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	// add device
//	@PostMapping("/user/{userName}")
//	public ResponseEntity<User> addDeviceByUserName(@PathVariable String name) {
//		return new ResponseEntity<>(service.findByUserName(name), HttpStatus.OK);
//	}

	// find * from table where userName = ''

	// updateNumberByUserName
	// addNumberByUserName

	// addDeviceByUserName
	// removeDeviceByUserName

	// addPlan
	// removePlan

}
