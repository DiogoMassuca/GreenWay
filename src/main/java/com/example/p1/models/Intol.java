package com.example.p1.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="intols")
public class Intol {
    @Column(name="intol_type") String type;
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
