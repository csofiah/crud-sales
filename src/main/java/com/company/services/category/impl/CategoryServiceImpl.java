package com.company.services.category.impl;

import com.company.model.Category;
import com.company.repo.category.ICategoryRepo;
import com.company.services.category.ICategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements ICategoryService {

    private final ICategoryRepo repo;


    @Override
    public Category save(Category category) throws Exception {
        return repo.save(category);
    }

    //cuando viene un objeto cuya llave primaria no existe, va hacer un insert
    //pero cuando la llave primaria exista, se comportara como un update
    @Override
    public Category update(Category category) throws Exception {
        return repo.save(category);
    }

    @Override
    public List<Category> readAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public  Category readById(Integer id) throws Exception {
        return repo.findById(id).orElse(new Category()); //devuelve un optional
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }
}
