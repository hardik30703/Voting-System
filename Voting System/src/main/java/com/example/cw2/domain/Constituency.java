package com.example.cw2.domain;

import javax.persistence.*;

@Entity
public class Constituency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int constituency_id;

    @Column(name = "constituency_name")
    private String constituency_name;

    public int getConstituency_id() {
        return constituency_id;
    }

    public void setConstituency_id(int constituency_id) {
        this.constituency_id = constituency_id;
    }

    public String getConstituency_name() {
        return constituency_name;
    }

    public void setConstituency_name(String constituency_name) {
        this.constituency_name = constituency_name;
    }
}
