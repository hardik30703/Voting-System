package com.example.cw2.Repository;

import com.example.cw2.domain.UVC_Codes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UVCCodesRepository extends CrudRepository<UVC_Codes, Integer> {

    UVC_Codes findByCode(String code);
}
