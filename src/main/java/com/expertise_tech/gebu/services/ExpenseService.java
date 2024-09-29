package com.expertise_tech.gebu.services;

import com.expertise_tech.gebu.entites.Expense;
import com.expertise_tech.gebu.repositories.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public Expense saveExpense(Expense expense){
        return expenseRepository.save(expense);
    }

    public List<Expense> getAllExpenses(){
        return expenseRepository.findAll();
    }

    public List<Expense> getExpensesByBudget(Long id){
        return expenseRepository.findByBudget(id);
    }

    public Expense getExpenseById (Long id){
        return expenseRepository.findById(id).get();
    }

    public Expense updateExpense (Expense e){
        return expenseRepository.save(e);
    }

    public void deleteExpenseById (Long id){
        expenseRepository.deleteById(id);
    }

}
