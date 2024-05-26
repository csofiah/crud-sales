package com.company.controller.category;

import com.company.model.Category;
import com.company.services.category.ICategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final ICategoryService categoryService;

    @GetMapping
    public List<Category> readAll() throws Exception {
       return categoryService.readAll();
    }

    @GetMapping("/{id}")
    public Category readById(@PathVariable("id") Integer id) throws Exception {
        return categoryService.readById(id);
    }

    @PostMapping
    public Category create(@RequestBody Category category) throws Exception {
        return categoryService.save(category);
    }

    @PutMapping("/{id}")
    public Category update(@PathVariable("id") Integer id, @RequestBody Category category) throws Exception{
        category.setIdCategory(id);
        return categoryService.update(category);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) throws Exception {
        categoryService.delete(id);
    }


}
