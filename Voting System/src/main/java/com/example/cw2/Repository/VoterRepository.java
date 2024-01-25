package com.example.cw2.Repository;

import com.example.cw2.domain.Candidate;
import com.example.cw2.domain.Election_Commission_Officer;
import com.example.cw2.domain.Voter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface VoterRepository extends CrudRepository<Voter, Integer> {


}
