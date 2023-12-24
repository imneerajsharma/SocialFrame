package com.neeraj.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neera.models.User;

@RestController
public class UserController {
	
	
	@GetMapping("/users")
	public List<User> getUserId() {
		List<User> users=new ArrayList<>();
		User user1=new User(01,"code","neeraj","neeraj@gmail.com","12345");
		User user2=new User(02,"code","Ajay","ajay@gmail.com","123abc");
		
		users.add(user1);
		users.add(user2);
		return users;
	}
	
	@GetMapping("/users/{usersId}")
	public User getUsers(@PathVariable("usersId")Integer id) {
		
		User user1=new User(01,"code","neeraj","neeraj@gmail.com","12345666");
				
		user1.setId(id);
		
		
		return user1;
	}
	
	@PostMapping("/users")
	public User createUser(@RequestBody User user) {
		
		User newUser=new User();
		newUser.setEmail(user.getEmail());
		newUser.setFirstName(user.getFirstName());
		newUser.setLastName(user.getLastName());
		newUser.setPassword(user.getPassword());
		newUser.setId(user.getId());
		return newUser;
	}
	
	@PutMapping("/users")
	public User updateUser(@RequestBody User user) {
		User user1=new User(01,"code","neeraj","neeraj@gmail.com","12345");
		
		if(user.getFirstName()!=null) {
			user1.setFirstName(user.getFirstName());
		}
		
		if(user.getLastName()!=null) {
			user1.setLastName(user.getLastName());
		}
		
		if(user.getEmail()!=null) {
			user1.setEmail(user.getEmail());
		}
		
		if(user.getPassword()!=null) {
			user1.setPassword(user.getPassword());
		}
		
		
		return user1;
	}
	
	@DeleteMapping("/users/{userId}")
	public String deleteUser(@PathVariable Integer userId) {
		
		return "user deleted successfully with id " + userId;
	}
	
	
	
	

	
	
	
	
}
