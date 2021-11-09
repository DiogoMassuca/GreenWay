package com.example.p1.models;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name, password, email;
    private int id;
    private int nextId = 0;

    private ArrayList<Intol>intols;
    private ArrayList<Rate>rates;
    public User(String name, String password){
        this.name = name;
        this.id = nextId;
        this.password = password;
        email = "";
        nextId++;
        
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getId() {
        return id;
    }
    public ArrayList<Intol>getIntols(){
        return intols;
    }
    public ArrayList<Rate>getRates(){
        return rates;
    }
}
