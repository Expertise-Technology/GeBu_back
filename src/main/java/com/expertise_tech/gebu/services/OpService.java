package com.expertise_tech.gebu.services;

import com.expertise_tech.gebu.entites.Op;
import com.expertise_tech.gebu.repositories.OpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpService {

    @Autowired
    private OpRepository opRepository;

    public Op saveOp(Op op){
        return opRepository.save(op);
    }

    public List<Op> getAllOp(){
        return opRepository.findAll();
    }
}
