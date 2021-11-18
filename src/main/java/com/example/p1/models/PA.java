package com.example.p1.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pratoalimento")
public class PA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="pa_id") private int pa_id;
    @Column(name="pa_pra_id")private int pra_id;
    @Column(name="pa_ali_id")private int ali_name;

    public int getPa_id() {
        return pa_id;
    }

    public int getPra_id() {
        return pra_id;
    }

    public int getAli_name() {
        return ali_name;
    }

}
