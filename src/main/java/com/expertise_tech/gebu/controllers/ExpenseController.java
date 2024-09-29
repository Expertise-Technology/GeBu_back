package com.expertise_tech.gebu.controllers;

import com.expertise_tech.gebu.entites.Expense;
import com.expertise_tech.gebu.services.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expense")
@CrossOrigin(origins = "*")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @PostMapping
    public ResponseEntity<Expense> createExpense(@RequestBody Expense expense){
        return new ResponseEntity<>(expenseService.saveExpense(expense), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Expense> getAllExpenses(){
        return expenseService.getAllExpenses();
    }

    @GetMapping(value = "/{id}")
    public Expense getExpenseById(@PathVariable("id") Long id){
        return expenseService.getExpenseById(id);
    }

    @PutMapping
    public Expense updateExpense (@RequestBody Expense e){
        return expenseService.updateExpense(e);
    }

    @GetMapping("/bybudget/{id}")
    public List<Expense> getExpensesByBudget(@PathVariable Long id){
        return expenseService.getExpensesByBudget(id);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteExpense(@PathVariable("id") Long id) {
        expenseService.deleteExpenseById(id);

    }
}
