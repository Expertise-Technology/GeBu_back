package com.expertise_tech.gebu.repositories;

import com.expertise_tech.gebu.entites.Budget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BudgetRepository extends JpaRepository<Budget,Long> {

    @Query("SELECT b FROM Budget b WHERE b.center.id = :id")
    List<Budget> findByCenter(@Param("id") Long id);
}
