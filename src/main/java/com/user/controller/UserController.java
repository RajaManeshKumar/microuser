package com.user.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entites.User;
import com.user.service.UserService;
@RequestMapping("/user")
@RestController
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	
	@PostMapping("/")
	public ResponseEntity<User> createUser(@RequestBody User user){
		User userObj=userService.saveUser(user);
		System.out.println("Service is running");

		return ResponseEntity.status(HttpStatus.CREATED).body(userObj);
		
	}
	
	@GetMapping("/singleuser")
	public ResponseEntity<User>getSingleUser(@PathVariable String userId){
		User user=userService.getUser(userId);
		return ResponseEntity.ok(user);
	}
	
	@GetMapping
	public ResponseEntity<List<User>> getAllUser(){
		List<User> userObjects=userService.getAllUser();
		return ResponseEntity.ok(userObjects);
		
	}	
	
	

}
