package com.example.cw2.domain;

import javax.persistence.*;

@Entity
public class UVC_Codes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "code")
    private String code;

    public UVC_Codes(String code) {
        this.code = code;
    }

    public UVC_Codes() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
