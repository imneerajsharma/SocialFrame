package com.neeraj.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neera.models.User;

@RestController
public class UserController {
	
	@GetMapping("/users")
	public List<User> getUsers() {
		List<User> users=new ArrayList<>();
		User user1=new User("code","neeraj","neeraj@gmail.com","12345");
		User user2=new User("code","Ajay","ajay@gmail.com","123abc");
		
		users.add(user1);
		users.add(user2);
		return users;
	}
}