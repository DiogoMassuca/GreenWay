package com.example.p1.models.repositories;
import java.util.ArrayList;

import com.example.p1.models.*;

import org.springframework.data.repository.CrudRepository;

public interface PratoRepository extends CrudRepository<Prato, Integer> {
    static ArrayList<Prato> pratos = new ArrayList<Prato>();
    
    public static Prato getPrato(String name) {
        for (Prato prato : pratos) {
            if (prato.getName() == name) return prato;
        }
        return null;
    }
}
