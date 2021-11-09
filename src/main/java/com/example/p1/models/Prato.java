package com.example.p1.models;

import java.util.ArrayList;
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
    private String name;
    private String type;
    private ArrayList<Ementa>pr;

    public Prato(String name, String type) {
        this.name = name;
        this.type = type;
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
