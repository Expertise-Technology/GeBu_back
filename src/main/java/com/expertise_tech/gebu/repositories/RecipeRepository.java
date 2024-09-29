package com.expertise_tech.gebu.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.expertise_tech.gebu.entites.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

    @Query("SELECT b FROM Recipe b WHERE b.budget.id = :id")
    List<Recipe> findByBudget(@Param("id") Long id);
}
