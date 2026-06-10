package com.codewithsumit.blog.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.codewithsumit.blog.entities.Category;
import com.codewithsumit.blog.exeptions.ResourceNotFoundException;
import com.codewithsumit.blog.payloads.CategoryDto;
import com.codewithsumit.blog.repositories.CategoryRepo;
import com.codewithsumit.blog.services.CategoryService;


// ===========================this class implements CategoryService class for defining methods========================
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepo categoryRepo;
	
	
	@Autowired
	private ModelMapper modelmapper;          // ----------------change to categories to categoriesDto through model mapper
	
	
	
	// Add unimplements Methods by default of control+ 1
	
	@Override
	public CategoryDto createCategory(CategoryDto categoryDto) {
		Category cat = this.modelmapper.map(categoryDto, Category.class);
		Category addedcat = (Category) this.categoryRepo.save(cat);
		return this.modelmapper.map(addedcat, CategoryDto.class);
		
	}

	
	@Override
	public CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId) {
		Category cat =  this.categoryRepo.findById(categoryId)
				.orElseThrow(()-> new ResourceNotFoundException("Category","category Id", categoryId));
				cat.setCategoryTitle(categoryDto.getCategoryTitle());
				cat.setCategoryDescription(categoryDto.getCategoryDescription());
				
				Category updatedcat = this.categoryRepo.save(cat);
				
		return this.modelmapper.map(updatedcat, CategoryDto.class);
	}

	@Override
	public void deleteCategory(Integer categoryId) {
		
		Category cat = this.categoryRepo.findById(categoryId)
				.orElseThrow(()-> new ResourceNotFoundException("Category","category id", categoryId));
		
		this.categoryRepo.delete(cat);
	}

	@Override
	public CategoryDto getCategory(Integer categoryId) {
		
		Category cat = this.categoryRepo.findById(categoryId)
				.orElseThrow(()-> new ResourceNotFoundException("Category", "category id", categoryId));
		
		return this.modelmapper.map(cat, CategoryDto.class);
	}

	@Override
	public List<CategoryDto> getCategories() {
		
		List<Category> categories = this.categoryRepo.findAll();
		
		List<CategoryDto> catDtos = categories.stream().map((cat-> this.modelmapper.map(cat, CategoryDto.class))).collect(Collectors.toList());
		
		return catDtos;
	}

}
