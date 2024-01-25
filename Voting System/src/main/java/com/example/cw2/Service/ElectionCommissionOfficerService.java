package com.example.cw2.Service;

import com.example.cw2.Repository.ElectionCommissionOfficerRepository;
import com.example.cw2.domain.Election_Commission_Officer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElectionCommissionOfficerService {
    @Autowired
    private ElectionCommissionOfficerRepository ecoRepository;

//    public void save(Election_Commission_Officer a){
//        ecoRepository.save(a);
//    }

    public Election_Commission_Officer findByUsername(String username) {
        return ecoRepository.findByUsername(username);
    }
}
