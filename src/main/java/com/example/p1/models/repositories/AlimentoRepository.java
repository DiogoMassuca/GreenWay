package com.example.p1.models.repositories;
import java.util.ArrayList;
import com.example.p1.models.*;

import org.springframework.data.repository.CrudRepository;

public interface AlimentoRepository extends CrudRepository<Alimento, Integer> {
    static ArrayList<Alimento> alimentos = new ArrayList<Alimento>();

    public static Alimento getAlimento(String name) {
        for (Alimento alimento : alimentos) {
            if (alimento.getName() == name) return alimento;
        }
        return null;
    }
}
