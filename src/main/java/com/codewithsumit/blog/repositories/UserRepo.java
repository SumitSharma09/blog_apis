package com.codewithsumit.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithsumit.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	

}
