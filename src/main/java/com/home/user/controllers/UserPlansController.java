package com.home.user.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 

import com.home.user.beans.User;
import com.home.user.beans.UserPlans;
import com.home.user.beans.PhoneInfo;
import com.home.user.beans.Plans;
import com.home.user.service.UserPlansService;
import com.home.user.service.UserService;

@RestController
@RequestMapping("/usersplans")
@CrossOrigin(origins = "*")
public class UserPlansController {
	
	@Autowired
	private UserPlansService service;
	
	@GetMapping("/userplans/{userPlanId}")
	public ResponseEntity<UserPlans> getUserPlans(@PathVariable("userPlanId") int userPlanId){
		return new ResponseEntity<>(service.findById(userPlanId), HttpStatus.OK);
	}
	
	@PostMapping("/userplans")
	public ResponseEntity<UserPlans> create(@RequestBody @Valid UserPlans userPlans){
		return new ResponseEntity<>(service.save(userPlans), HttpStatus.CREATED);
	}
	
	@PutMapping("/userplans/{userPlanId}")
	public ResponseEntity<Void> create(@PathVariable("userPlanId")int userplanId, @RequestBody @Valid UserPlans userPlans){
		service.update(userplanId, userPlans);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("/userplans/{userPlanId}")
	public ResponseEntity<Void> deleteUserPlans(@PathVariable("userPlanId") int userPlanId){
		service.deleteUserPlans(userPlanId);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
