package com.codewithsumit.blog.services;

import java.util.List;

import com.codewithsumit.blog.payloads.CategoryDto;


// all methods are performing to do...........create, delete, update and get all categories in this services package


public interface CategoryService {
	
	// create
	 CategoryDto createCategory(CategoryDto categoryDto);
	
	// update
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);

	// delete
	void deleteCategory(Integer categoryId);
	
	// get
	CategoryDto getCategory(Integer categoryId);
	
	// get All
	List<CategoryDto> getCategories();
}
