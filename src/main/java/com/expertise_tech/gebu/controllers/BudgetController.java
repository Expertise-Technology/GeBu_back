package com.expertise_tech.gebu.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expertise_tech.gebu.entites.Budget;
import com.expertise_tech.gebu.services.BudgetService;

@RestController
@RequestMapping("/api/budget")
@CrossOrigin(origins = "*")
public class BudgetController {

    @Autowired
    private BudgetService budgetService;

    @PostMapping
    public ResponseEntity<Budget> createBudget(@RequestBody Budget budget){
        return new ResponseEntity<>(budgetService.saveBudget(budget), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Budget> getAllBudgets(){
        return budgetService.getAllBudgets();
    }

    @GetMapping(value = "/{id}")
    public Budget getBudgetById(@PathVariable("id") Long id){
        return budgetService.getBudgetById(id);
    }

    @PutMapping
    public Budget updateBudget (@RequestBody Budget b){
        return budgetService.updateBudget(b);
    }

    @GetMapping("/bycenter/{id}")
    public List<Budget> getBudgetByCenter(@PathVariable Long id){
        return budgetService.getBudgetByCenter(id);
    }
}
