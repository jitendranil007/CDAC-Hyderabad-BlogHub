package com.ishan.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ishan.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
