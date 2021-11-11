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
    @Column(name="intol_type") String type;
    @Column(name="intol_res")private int user_id;
    @Column(name="intol_ali")private String ali_name;

    public Intol(String type, int user_id, String ali_name){
        this.type = type;
        this.user_id = user_id;
        this.ali_name = ali_name;
    }

    public String getType() {
        return type;
    }

    public int getUser() {
        return user_id;
    }

    public String getAlimento() {
        return ali_name;
    }
}
