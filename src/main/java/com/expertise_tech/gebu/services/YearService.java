package com.expertise_tech.gebu.services;

import com.expertise_tech.gebu.entites.Year;
import com.expertise_tech.gebu.repositories.YearRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YearService {

    @Autowired
    private YearRepository yearRepository;

    public Year saveYear(Year year){
        return yearRepository.save(year);
    }

    public List<Year> getAllYears(){
        return yearRepository.findAll();
    }
}
