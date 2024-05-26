package com.company.repo.category;

import com.company.model.Category;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryRepo {

    public void save(Category category){
        System.out.println("Saving category " + category);
    }
}
