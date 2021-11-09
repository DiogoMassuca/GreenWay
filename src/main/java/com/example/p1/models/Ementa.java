package com.example.p1.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Ementa {
    @JsonIgnoreProperties({"pr"})
    
    private String type;    
    private Restaurante restaurante;
    private Prato prato;
    
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
