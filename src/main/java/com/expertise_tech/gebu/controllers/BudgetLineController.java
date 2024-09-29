package com.expertise_tech.gebu.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expertise_tech.gebu.entites.BudgetLine;
import com.expertise_tech.gebu.services.BudgetLineService;

@RestController
@RequestMapping("/api/budgetline")
@CrossOrigin(origins = "*")
public class BudgetLineController {

    @Autowired
    private BudgetLineService budgetLineService;

    @PostMapping
    public ResponseEntity<BudgetLine> createBudgetLine(@RequestBody BudgetLine budgetLine){
        return new ResponseEntity<>(budgetLineService.saveBudgetLine(budgetLine), HttpStatus.CREATED);
    }

    @GetMapping
    public List<BudgetLine> getAllBudgetLines(){
        return budgetLineService.getAllBudgetLines();
    }


    @GetMapping(value = "/{id}")
    public BudgetLine getBudgetLineById(@PathVariable("id") Long id){
        return budgetLineService.getBudgetLineById(id);
    }
}
