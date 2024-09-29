package com.expertise_tech.gebu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expertise_tech.gebu.entites.BudgetLine;
import com.expertise_tech.gebu.repositories.BudgetLineRepository;

@Service
public class BudgetLineService {

    @Autowired
    private BudgetLineRepository budgetLineRepository;

    public BudgetLine saveBudgetLine(BudgetLine budgetLine){
        return budgetLineRepository.save(budgetLine);
    }

    public List<BudgetLine> getAllBudgetLines(){
        return budgetLineRepository.findAll();
    }

    public BudgetLine getBudgetLineById (Long id){
        return budgetLineRepository.findById(id).get();
    }
}
