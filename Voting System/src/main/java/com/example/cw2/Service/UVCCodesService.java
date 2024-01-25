package com.example.cw2.Service;

import com.example.cw2.Repository.UVCCodesRepository;
import com.example.cw2.domain.UVC_Codes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UVCCodesService {
    @Autowired
    private UVCCodesRepository uvcRepo;

    public void save(UVC_Codes a){
        uvcRepo.save(a);
    }

    public UVC_Codes findByCode (String code) {
        return uvcRepo.findByCode(code);
    }
}
