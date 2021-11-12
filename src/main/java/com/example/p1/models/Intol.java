package com.example.p1.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="intols")
public class Intol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="intol_id") private int intol_id;
    @Column(name="intol_user_id")private int user_id;
    @Column(name="intol_ali_id")private String ali_name;
    private int nextId = 0;

    public Intol(int intol_id, int user_id, String ali_name){
        this.intol_id = nextId;
        this.user_id = user_id;
        this.ali_name = ali_name;
        nextId++;
    }

    public int getIntolId() {
        return intol_id;
    }

    public int getUser() {
        return user_id;
    }

    public String getAlimento() {
        return ali_name;
    }
}
