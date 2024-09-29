package com.expertise_tech.gebu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expertise_tech.gebu.entites.Category;
import com.expertise_tech.gebu.repositories.CategoryRepository;

@Service
public class CategoryService {


    @Autowired
    private CategoryRepository categoryRepository;

    public Category saveCategory(Category category){
        return categoryRepository.save(category);
    }

    public List<Category> getAllCategory(){
        return categoryRepository.findAll();
    }
}
