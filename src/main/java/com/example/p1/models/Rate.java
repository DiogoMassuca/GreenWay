package com.example.p1.models;

public class Rate {
    private float rating;
    private User user;
    private Restaurante restaurante;
    
    public Rate(float rating, User user, Restaurante restaurante) {
        this.rating = rating;
        this.user = user;
        this.restaurante = restaurante;
    }

    public float getRating() {
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
