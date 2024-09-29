package com.expertise_tech.gebu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expertise_tech.gebu.entites.Center;

public interface CenterRepository extends JpaRepository<Center, Long> {

//        @Query("SELECT c FROM Center c WHERE c.year = :year")
//        List<Center> findByYear(@Param("year") int year);

}
