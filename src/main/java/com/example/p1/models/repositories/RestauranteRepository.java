package com.example.p1.models.repositories;

import java.util.ArrayList;
import com.example.p1.models.*;

public class RestauranteRepository {
    private static ArrayList<Restaurante> restaurantes = new ArrayList<Restaurante>();
    public static void populate(){
        restaurantes.add(new Restaurante("Veggie", "veggie@gmail.com"));
    }
    public static ArrayList<Restaurante> getAllRestaurantes() {
        return restaurantes;
    }

    public static Restaurante addRestaurante(Restaurante restaurante) {
        restaurantes.add(restaurante);
        return restaurante;
    }

    public static Restaurante getRestaurante(String name) {
        for (Restaurante restaurante : restaurantes) {
            if (restaurante.getName() == name) return restaurante;
        }
        return null;
    }
}
