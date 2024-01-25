package com.example.cw2.Repository;

import com.example.cw2.domain.Candidate;
import com.example.cw2.domain.Constituency;
import com.example.cw2.domain.Voter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VotingRepository extends CrudRepository<Candidate, Integer> {

}
