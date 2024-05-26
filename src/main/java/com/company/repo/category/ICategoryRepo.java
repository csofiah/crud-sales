package com.company.repo.category;

import com.company.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

//NO es necesario marcar esta clase con @Repository porque se esta usando JpaRepository y es una clase de Spring
public interface ICategoryRepo extends JpaRepository<Category, Integer> {
}
