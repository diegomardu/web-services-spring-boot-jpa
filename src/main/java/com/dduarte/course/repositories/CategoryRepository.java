package com.dduarte.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dduarte.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
