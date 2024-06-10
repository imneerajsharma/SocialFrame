package com.neeraj.social_frame.controller;

import com.neeraj.social_frame.models.User;
import com.neeraj.social_frame.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("/users")
    public User createUser(@RequestBody User user){
        User newUser=new User();
        newUser.setId(user.getId());
        newUser.setFirstName(user.getFirstName());
        newUser.setLastName(user.getLastName());
        newUser.setEmail(user.getEmail());
        newUser.setPassword(user.getPassword());

        User savedUser=userRepository.save(newUser);
        return savedUser;
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        List<User> users =new ArrayList<>();
        User user1=new User(1,"neeraj","sharma","neeraj@gmail.com","123456");
        User user2=new User(2,"rahul","kumar","rahul@gmail.com","1234567890000");
        users.add(user1);
        users.add(user2);
        return users;
    }

    @GetMapping("/users/{userId}")
    public User getUserById(@PathVariable("userId") Integer id){
        User user1=new User(1,"neeraj","sharma","neeraj@gmail.com","123456");
        user1.setId(id);
        return user1;
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User user){
        User user1=new User(2,"neeraj123","123sharma","neeraj@gmail.com","123456");
        if(user.getFirstName()!=null){
            user1.setFirstName(user.getFirstName());
        }
        if(user.getLastName()!=null){
            user1.setLastName(user.getLastName());
        }
        if(user.getEmail()!=null){
            user1.setEmail(user.getEmail());
        }
        return user1;
    }

    @DeleteMapping("users/{userId}")
    public String deleteUser(@PathVariable ("userId") Integer id){
        return "user deleted successfully with id : " + id;
    }
}
