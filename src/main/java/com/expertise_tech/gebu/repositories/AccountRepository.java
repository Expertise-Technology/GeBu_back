package com.expertise_tech.gebu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.expertise_tech.gebu.entites.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
	
	@Query("SELECT a FROM Account a WHERE a.center.id = :id")
    Account findByCenter(@Param("id") Long id);
}
