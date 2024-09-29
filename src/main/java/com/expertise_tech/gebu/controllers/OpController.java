package com.expertise_tech.gebu.controllers;

import com.expertise_tech.gebu.entites.Op;
import com.expertise_tech.gebu.services.OpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/op")
@CrossOrigin(origins = "*")
public class OpController {

    @Autowired
    private OpService opService;

    @PostMapping
    public ResponseEntity<Op> createOp(@RequestBody Op op){
        return new ResponseEntity<>(opService.saveOp(op), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Op> getAllOp(){
        return opService.getAllOp();
    }
}
