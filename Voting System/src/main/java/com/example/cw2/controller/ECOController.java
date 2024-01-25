package com.example.cw2.controller;

import com.example.cw2.Service.VotingService;
import com.example.cw2.domain.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class ECOController {
    @Autowired
    private VotingService votingService;

    @GetMapping("/Vote_Count")
    public String showVoteCount(Model model) {
        List<Candidate> candidate = votingService.getAllCandidates();
        model.addAttribute("candidate", candidate);
        return "Vote_Count";
    }

    @GetMapping("/start_voting")
    public String startVoting(Model model) {
        votingService.startVoting();
        return "ElectionCommissionOfficer_Dashboard";
    }

    @GetMapping("/end_voting")
    public String endVoting(Model model) {
        votingService.endVoting();
        return "ElectionCommissionOfficer_Dashboard";
    }

    @GetMapping("/ElectionCommissionOfficer_Dashboard")
    public String ECODashboard(Model model) {
        return "ElectionCommissionOfficer_Dashboard";
    }

    @RequestMapping("/gevs/constituency/")
    public @ResponseBody Object listAllJson(Model model){
        Object o=votingService.getAllCandidates();
        return o;
    }
}
