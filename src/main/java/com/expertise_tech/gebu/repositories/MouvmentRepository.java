package com.expertise_tech.gebu.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.expertise_tech.gebu.entites.Mouvment;

public interface MouvmentRepository extends JpaRepository<Mouvment, Long> {
	
	@Query("SELECT m FROM Mouvment m WHERE m.account.id = :id")
	List<Mouvment> findMouvmentByAccount(@Param("id") Long id);

}
