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

import com.expertise_tech.gebu.entites.Center;
import com.expertise_tech.gebu.services.CenterService;

@RestController
@RequestMapping("/api/centers")
@CrossOrigin(origins = "*")
public class CenterController {

        @Autowired
        private CenterService centerService;

        @PostMapping
        public ResponseEntity<Center> createCenter(@RequestBody Center center) {
            return new ResponseEntity<>(centerService.saveCenter(center), HttpStatus.CREATED);
        }

        @GetMapping
        public List<Center> getCentersByYear() {
            return centerService.getAllCenters();
        }

    @GetMapping(value = "/{id}")
    public Center getCenterById(@PathVariable("id") Long id){
        return centerService.getCenterById(id);
    }

}
