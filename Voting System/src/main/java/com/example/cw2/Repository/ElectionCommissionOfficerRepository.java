package com.example.cw2.Repository;

import com.example.cw2.domain.Election_Commission_Officer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ElectionCommissionOfficerRepository extends CrudRepository<Election_Commission_Officer, Integer> {

    Election_Commission_Officer findByUsername(String username);
}
