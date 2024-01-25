package com.example.cw2.Service;

import com.example.cw2.Repository.VoterRepository;
import com.example.cw2.domain.Candidate;
import com.example.cw2.domain.Voter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoterService {
    @Autowired
    private VoterRepository voterRepository;

    public void save(Voter a){
        voterRepository.save(a);
    }


}
