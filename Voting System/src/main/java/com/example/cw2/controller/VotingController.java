package com.example.cw2.controller;

import com.example.cw2.Service.VotingService;
import com.example.cw2.domain.Candidate;
import com.example.cw2.domain.Voter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class VotingController {
    @Autowired
    private VotingService votingService;

    @GetMapping("/Voting_Page")
    public String showCandidates(Model model, Voter constituency_id) {
        List<Candidate> candidates = votingService.getAllCandidates();
        model.addAttribute("candidates", candidates);

        // Check if voting has ended
        boolean votingEnded = votingService.hasVotingEnded();

        // Add attribute to indicate whether voting has ended
        model.addAttribute("votingEnded", votingEnded);
        return "Voting_Page";
    }

    @RequestMapping(value = "/vote/{canid}")
    public String vote(@PathVariable Integer canid){
        Candidate candidate = votingService.findById(canid);
        candidate.setVote_count(candidate.getVote_count()+1);
        votingService.save(candidate);
        return "Homescreen";
    }

}
