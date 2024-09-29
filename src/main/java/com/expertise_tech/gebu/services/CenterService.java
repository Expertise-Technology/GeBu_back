package com.expertise_tech.gebu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expertise_tech.gebu.entites.Center;
import com.expertise_tech.gebu.repositories.CenterRepository;

@Service
public class CenterService {

        @Autowired
        private CenterRepository centerRepository;

        public Center saveCenter(Center center) {
            return centerRepository.save(center);
        }

        public List<Center> getAllCenters() {
            return centerRepository.findAll();
        }

    public Center getCenterById (Long id){
        return centerRepository.findById(id).get();
    }

}
