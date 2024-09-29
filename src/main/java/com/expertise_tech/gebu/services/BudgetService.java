package com.expertise_tech.gebu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expertise_tech.gebu.entites.Budget;
import com.expertise_tech.gebu.repositories.BudgetRepository;

@Service
public class BudgetService {

    @Autowired
    private BudgetRepository budgetRepository;

    public Budget saveBudget(Budget budget){
        return budgetRepository.save(budget);
    }

    public List<Budget> getAllBudgets(){
        return budgetRepository.findAll();
    }

    public List<Budget> getBudgetByCenter(Long id){
        return budgetRepository.findByCenter(id);
    }

    public Budget getBudgetById (Long id){
        return budgetRepository.findById(id).get();
    }

    public Budget updateBudget (Budget e){
        return budgetRepository.save(e);
    }
}
