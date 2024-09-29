package com.expertise_tech.gebu.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.expertise_tech.gebu.entites.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    @Query("SELECT b FROM Expense b WHERE b.budget.id = :id")
    List<Expense> findByBudget(@Param("id") Long id);
}
