package com.example.p1.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Intol {
    @JsonIgnoreProperties({"intols"})
    private String type;
    private User user;
    private Alimento alimento;

    public Intol(String type, User user, Alimento alimento){
        this.type = type;
        this.user = user;
        this.alimento = alimento;
    }

    public String getType() {
        return type;
    }

    public User getUser() {
        return user;
    }

    public Alimento getAlimento() {
        return alimento;
    }
}
