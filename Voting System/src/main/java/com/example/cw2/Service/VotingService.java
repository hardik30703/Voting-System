package com.example.cw2.Service;

import com.example.cw2.Repository.VotingRepository;
import com.example.cw2.domain.Candidate;
import com.example.cw2.domain.Constituency;
import com.example.cw2.domain.Election_Commission_Officer;
import com.example.cw2.domain.Voter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VotingService {
    @Autowired
    private VotingRepository votingRepository;


    public List<Candidate> getAllCandidates() {
        return (List<Candidate>) votingRepository.findAll();
    }

    public Candidate findById(int canid) {
        return votingRepository.findById(canid).get();
    }

    public void save(Candidate a){
        votingRepository.save(a);
    }

    private boolean votingEnded = true;

    public void endVoting() {
        votingEnded = true;
    }

    public void startVoting() {
        votingEnded = false;
    }

    public boolean hasVotingEnded() {
        return votingEnded;
    }

}
