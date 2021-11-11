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
    @Column(name="eme_res") int res_id;
    @Column(name="eme_pra") int pra_id;
    
    public Ementa(String type, int res_id, int pra_id) {
        this.type = type;
        this.res_id = res_id;
        this.pra_id = pra_id;
    }

    public String getType() {
        return type;
    }

    public int getRestaurante() {
        return res_id;
    }

    public int getPrato() {
        return pra_id;
    }
}
