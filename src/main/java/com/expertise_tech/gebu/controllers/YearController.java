package com.expertise_tech.gebu.controllers;

import com.expertise_tech.gebu.entites.Year;
import com.expertise_tech.gebu.services.YearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/year")
@CrossOrigin(origins = "*")
public class YearController {

    @Autowired
    private YearService yearService;

    @PostMapping
    public ResponseEntity<Year> createYear(@RequestBody Year year){
        return new ResponseEntity<>(yearService.saveYear(year), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Year> getAllYears(){
        return yearService.getAllYears();
    }

}
