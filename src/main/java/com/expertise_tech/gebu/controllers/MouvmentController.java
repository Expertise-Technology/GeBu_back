package com.expertise_tech.gebu.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expertise_tech.gebu.entites.Mouvment;
import com.expertise_tech.gebu.services.MouvmentService;

@RestController
@RequestMapping("/api/mouvment")
@CrossOrigin(origins = "*")
public class MouvmentController {


    @Autowired
    private MouvmentService mouvmentService;

    @PostMapping
    public ResponseEntity<Mouvment> createMouvment(@RequestBody Mouvment mouvment) {
        return new ResponseEntity<>(mouvmentService.saveMouvment(mouvment), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Mouvment> getAllMouvments() {
        return mouvmentService.getAllMouvments();
    }
    
    @GetMapping(value = "/{id}")
    public List<Mouvment> getMouvmentByAccount(@PathVariable("id") Long id){
    	return mouvmentService.getMouvmentByAccount(id);
    }
}
