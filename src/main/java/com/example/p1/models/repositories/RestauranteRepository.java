package com.example.p1.models.repositories;

import java.util.ArrayList;
import com.example.p1.models.*;

import org.springframework.data.repository.CrudRepository;

public interface RestauranteRepository extends CrudRepository<Restaurante, Integer>{
    static ArrayList<Restaurante> restaurantes = new ArrayList<Restaurante>();

    public static Restaurante getRestaurante(int id) {
        for (Restaurante restaurante : restaurantes) {
            if (restaurante.getId() == id) return restaurante;
        }
        return null;
    }
}
