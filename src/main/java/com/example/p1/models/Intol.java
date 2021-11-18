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

    public Intol() {
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
