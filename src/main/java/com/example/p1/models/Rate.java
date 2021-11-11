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
    @Column(name="rate_rating")private double rating;
    private User user;
    private Restaurante restaurante;
    
    public Rate(double rating, User user, Restaurante restaurante) {
        this.rating = rating;
        this.user = user;
        this.restaurante = restaurante;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public User getUser() {
        return user;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }
}
