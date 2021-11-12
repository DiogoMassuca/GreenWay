package com.example.p1.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rates")
public class Rate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="rate_id")private int rate_id; 
    @Column(name="rate_res_id")private int res_id; 
    @Column(name="rate_rating")private double rating;
    @Column(name="rate_user_id")private int user_id;
    private int nextId = 0;

    public Rate(double rating, int user_id, int res_id) {
        this.rating = rating;
        this.user_id = user_id;
        this.res_id = res_id;
        this.rate_id = nextId;
        nextId++;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getUser() {
        return user_id;
    }

    public int getRestaurante() {
        return res_id;
    }
    
    public int getRateId(){
        return rate_id;
    }
}
