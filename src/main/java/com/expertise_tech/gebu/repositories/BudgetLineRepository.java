package com.expertise_tech.gebu.repositories;

import com.expertise_tech.gebu.entites.BudgetLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetLineRepository extends JpaRepository<BudgetLine, Long> {
}
