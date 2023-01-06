package com.sarhari.blogapp.services;

import java.util.List;


import com.sarhari.blogapp.payloads.CategoryDto;
 
public interface CategoryService {
	//create 
	public CategoryDto createCategory(CategoryDto categoryDto);
	
	//update
	public CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);
	
	//delete 
	public void deleteCategory(Integer categoryId);
	
	//get
	public CategoryDto getCategoryById(Integer categoryId);
	
	//get all
	public List<CategoryDto> getAllCategories();
}
