package com.company.services.category;

import com.company.model.Category;
import com.company.repo.category.CategoryRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private CategoryRepo repo;

    public void saveExpress(Category category) {

        if(category.getIdCategory() == 0){
            System.out.println("No existe el ID, no se puede guardar");
        }else{
            repo.save(category);

        }
    }
}
