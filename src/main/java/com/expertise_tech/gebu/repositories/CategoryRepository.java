package com.expertise_tech.gebu.repositories;

import com.expertise_tech.gebu.entites.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
