package com.daungochuyen.categorybase.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daungochuyen.categorybase.model.Category;
import com.daungochuyen.categorybase.repository.ICategoryRepositpry;

@Service
public class CategoryService implements ICategoryService<Category>{
	@Autowired
	private ICategoryRepositpry categoryRepository;
	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public Optional<Category> findByID(Long id) {
		return categoryRepository.findById(id);
	}

	@Override
	public Category save(Category t) {
		return categoryRepository.save(t);
	}

	@Override
	public void remove(Long id) {
		categoryRepository.deleteById(id);
	}

}
