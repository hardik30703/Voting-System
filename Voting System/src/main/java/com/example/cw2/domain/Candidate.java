package com.example.cw2.domain;

import javax.persistence.*;

@Entity
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int canid;

    @Column(name = "candidate")
    private String candidate;

    @Column(name = "party_id")
    private int party_id;

    @Column(name = "constituency_id")
    private int constituency_id;

    @Column(name = "vote_count")
    private int vote_count;

    public Candidate(int canid, String candidate, int party_id, int constituency_id) {
        this.canid = canid;
        this.candidate = candidate;
        this.party_id = party_id;
        this.constituency_id = constituency_id;
    }

    public Candidate() {

    }

    public int getCanid() {
        return canid;
    }

    public void setCanid(int canid) {
        this.canid = canid;
    }

    public String getCandidate() {
        return candidate;
    }

    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }

    public int getParty_id() {
        return party_id;
    }

    public void setParty_id(int party_id) {
        this.party_id = party_id;
    }

    public int getConstituency_id() {
        return constituency_id;
    }

    public void setConstituency_id(int constituency_id) {
        this.constituency_id = constituency_id;
    }

    public int getVote_count() {
        return vote_count;
    }

    public void setVote_count(int vote_count) {
        this.vote_count = vote_count;
    }
}
