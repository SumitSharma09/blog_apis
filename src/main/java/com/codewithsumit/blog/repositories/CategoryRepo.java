package com.codewithsumit.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithsumit.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
