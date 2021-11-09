package com.example.p1.models;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="restaurantes")
public class Restaurante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="res_name")private String name;
    @Column(name="res_contact")private String contact;
    @Column(name="res_id") private int id;
    private int nextId = 0;

    private ArrayList<Ementa>pr;
    private ArrayList<Rate>rates;

    public Restaurante(String name, String contact) {
        this.name = name;
        this.contact = contact;
        this.id = nextId;
        nextId++;
    }
    public String getName() {
        return name;
    }
    public String getContact() {
        return contact;
    }  
    public int getId(){
        return id;
    }
    public ArrayList<Ementa>getPratoRestaurante(){
        return pr;
    }
    public ArrayList<Rate>getRates(){
        return rates;
    }
}
