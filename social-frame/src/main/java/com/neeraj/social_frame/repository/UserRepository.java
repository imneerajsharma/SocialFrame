package com.neeraj.social_frame.repository;

import com.neeraj.social_frame.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Integer> {

}
