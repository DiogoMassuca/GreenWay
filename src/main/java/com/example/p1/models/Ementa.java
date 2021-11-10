package com.example.p1.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ementas")
public class Ementa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="eme_type") String type;    
    @Column(name="eme_res") Restaurante restaurante;
    @Column(name="eme_pra") Prato prato;
    
    public Ementa(String type, Restaurante restaurante, Prato prato) {
        this.type = type;
        this.restaurante = restaurante;
        this.prato = prato;
    }

    public String getType() {
        return type;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public Prato getPrato() {
        return prato;
    }
}
