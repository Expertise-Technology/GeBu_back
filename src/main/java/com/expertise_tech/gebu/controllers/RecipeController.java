package com.expertise_tech.gebu.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expertise_tech.gebu.entites.Recipe;
import com.expertise_tech.gebu.services.RecipeService;

@RestController
@RequestMapping("/api/recipe")
@CrossOrigin(origins = "*")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @PostMapping
    public ResponseEntity<Recipe> createRecipe(@RequestBody Recipe recipe){
        return new ResponseEntity<>(recipeService.saveRecipe(recipe), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Recipe> getAllRecipes(){
        return recipeService.getAllRecipe();
    }

    @GetMapping("/bybudget/{id}")
    public List<Recipe> getRecipesByBudget(@PathVariable Long id){
        return recipeService.getRecipesByBudget(id);
    }
    
    @GetMapping(value = "/{id}")
    public Recipe getRecipeById(@PathVariable Long id) {
    	return recipeService.getRecipeById(id);
    }
    
    @PutMapping
    public Recipe updateRecipe(@RequestBody Recipe recipe) {
    	return recipeService.updateRecipe(recipe);
	}
    
    @DeleteMapping(value = "/{id}")
    public void deleteRecipeById(@PathVariable("id") Long id) {
    	recipeService.deleteRecipeById(id);
    }
}
