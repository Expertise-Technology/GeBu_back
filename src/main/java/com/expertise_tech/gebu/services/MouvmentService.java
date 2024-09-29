package com.expertise_tech.gebu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expertise_tech.gebu.entites.Mouvment;
import com.expertise_tech.gebu.repositories.MouvmentRepository;

@Service
public class MouvmentService {

	@Autowired
    private MouvmentRepository mouvmentRepository;

    public Mouvment saveMouvment(Mouvment mouvment){
        return mouvmentRepository.save(mouvment);
    }

    public List<Mouvment> getAllMouvments(){
        return mouvmentRepository.findAll();
    }
    
    public List<Mouvment> getMouvmentByAccount (Long id){
    	return mouvmentRepository.findMouvmentByAccount(id);
    }
}
