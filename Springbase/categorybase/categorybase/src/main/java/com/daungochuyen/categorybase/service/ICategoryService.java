package com.daungochuyen.categorybase.service;

import java.util.List;
import java.util.Optional;

public interface ICategoryService<T> {
	List<T> findAll();
	Optional findByID(Long id);
	T save(T t);
	void remove(Long id);
}
