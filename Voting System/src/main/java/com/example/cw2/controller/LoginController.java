package com.example.cw2.controller;

import com.example.cw2.Service.ElectionCommissionOfficerService;
import com.example.cw2.domain.Election_Commission_Officer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
    @Autowired
    ElectionCommissionOfficerService ecs;

    @GetMapping("/ElectionCommissionOfficerLogin")
    public String showPOLoginForm() {
        return "ElectionCommissionOfficerLogin";
    }

    @PostMapping("/ElectionCommissionOfficerLogin")
    public String submitPOLoginForm(@RequestParam String username, @RequestParam String password) {
        Election_Commission_Officer eco = ecs.findByUsername(username);
        if (eco != null && eco.getPassword().equals(password)) {
            return "ElectionCommissionOfficer_Dashboard";
        }
        return "ErrorPage";
    }

}

