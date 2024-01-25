package com.example.cw2.domain;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Voter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int voter_id;

    @Column(name = "full_name")
    private String full_name;

    @Column(name = "DOB")
    private String DOB;

    @Column(name = "password")
    private String password;

    @Column(name = "UVC")
    private String UVC;

    @Column(name = "constituency_id")
    private int constituency_id;

    public Voter() {
    }

    public Voter(String full_name, String DOB, String password, String UVC, int constituency_id) {
        this.full_name = full_name;
        this.DOB = DOB;
        this.password = password;
        this.UVC = UVC;
        this.constituency_id = constituency_id;
    }

    public int getVoter_id() {
        return voter_id;
    }

    public void setVoter_id(int voter_id) {
        this.voter_id = voter_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUVC() {
        return UVC;
    }

    public void setUVC(String UVC) {
        this.UVC = UVC;
    }

    public int getConstituency_id() {
        return constituency_id;
    }

    public void setConstituency_id(int constituency_id) {
        this.constituency_id = constituency_id;
    }
}
