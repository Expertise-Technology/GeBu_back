package com.expertise_tech.gebu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expertise_tech.gebu.entites.Recipe;
import com.expertise_tech.gebu.repositories.RecipeRepository;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    public Recipe saveRecipe(Recipe recipe){
        return recipeRepository.save(recipe);
    }

    public List<Recipe> getAllRecipe(){
        return recipeRepository.findAll();
    }

    public List<Recipe> getRecipesByBudget(Long id){
        return recipeRepository.findByBudget(id);
    }
    
    public Recipe getRecipeById(Long id) {
		return recipeRepository.findById(id).get();
	}
    
    public Recipe updateRecipe (Recipe recipe) {
    	return recipeRepository.save(recipe);
    }
    
    public void deleteRecipeById(Long id) {
    	recipeRepository.deleteById(id);		
	}
}
