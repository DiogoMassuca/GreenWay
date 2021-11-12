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
    @Column(name="eme_id")  int eme_id;    
    @Column(name="eme_res_id") int res_id;
    @Column(name="eme_pra_id") int pra_id;
    
    public Ementa(int eme_id, int res_id, int pra_id) {
        this.eme_id = eme_id;
        this.res_id = res_id;
        this.pra_id = pra_id;
    }

    public int getEmeId() {
        return eme_id;
    }

    public int getRestaurante() {
        return res_id;
    }

    public int getPrato() {
        return pra_id;
    }
}
