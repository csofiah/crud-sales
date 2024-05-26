package com.company.repo.category;

import com.company.model.Category;

public class CategoryRepo {

    public void save(Category category){
        System.out.println("Saving category " + category);
    }
}
