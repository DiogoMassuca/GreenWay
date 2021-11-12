package com.example.p1.models;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="pratos")
public class Prato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="pra_id")private int id;
    @Column(name="pra_name")private String name;
    @Column(name="pra_type")private String type;
    private int nextId = 0;

    private ArrayList<Ementa>pr;

    public Prato(String name, String type) {
        this.name = name;
        this.type = type;
        this.id = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public String getType(){
        return type;    
    }
    public ArrayList<Ementa>getPratoRestaurante(){
        return pr;
    }
}
