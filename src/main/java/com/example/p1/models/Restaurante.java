package com.example.p1.models;

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
    @Column(name="res_id") private int id;
    @Column(name="res_name")private String name;
    @Column(name="res_contact")private String contact;
  
    public Restaurante() {
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
}
