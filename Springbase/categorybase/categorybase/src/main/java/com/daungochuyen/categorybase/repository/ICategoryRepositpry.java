package com.daungochuyen.categorybase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daungochuyen.categorybase.model.Category;

@Repository
public interface ICategoryRepositpry extends  JpaRepository<Category, Long>{

}
