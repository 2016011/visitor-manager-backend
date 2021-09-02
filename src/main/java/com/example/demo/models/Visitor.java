package com.example.demo.models;

import javax.persistence.*;

// create Visitor Class
// Auto generate "visitor" table when create database.
// use for communicating data with "visitor" table

@Entity
@Table(name = "visitors")
public class Visitor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "f_name")
    private String f_Name;

    @Column(name = "l_name")
    private String l_Name;

    @Column(name = "tel")
    private String tel;

    public Visitor(){

    }
    public Visitor(String f_Name, String l_Name, String tel) {
        super();
        this.f_Name = f_Name;
        this.l_Name = l_Name;
        this.tel = tel;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getF_Name() {
        return f_Name;
    }

    public void setF_Name(String f_Name) {
        this.f_Name = f_Name;
    }

    public String getL_Name() {
        return l_Name;
    }

    public void setL_Name(String l_Name) {
        this.l_Name = l_Name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
