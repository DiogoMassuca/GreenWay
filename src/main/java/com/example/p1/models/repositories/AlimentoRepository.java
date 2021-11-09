package com.example.p1.models.repositories;
import java.util.ArrayList;
import com.example.p1.models.*;

public class AlimentoRepository {
    private static ArrayList<Alimento> alimentos = new ArrayList<Alimento>();
    public static void populate(){
        alimentos.add(new Alimento("Camarão"));
    }
    public static ArrayList<Alimento> getAllAlimentos() {
        return alimentos;
    }

    public static Alimento addAlimento(Alimento alimento) {
        alimentos.add(alimento);
        return alimento;
    }

    public static Alimento getAlimento(String name) {
        for (Alimento alimento : alimentos) {
            if (alimento.getName() == name) return alimento;
        }
        return null;
    }
}
