package com.example.p1.models.repositories;
import java.util.ArrayList;

import com.example.p1.models.*;

public class PratoRepository {
    private static ArrayList<Prato> pratos = new ArrayList<Prato>();
    public static void populate(){
        pratos.add(new Prato("Ameijoas", "Marisco"));
    }
    public static ArrayList<Prato> getAllPratos() {
        return pratos;
    }

    public static Prato addPrato(Prato prato) {
        pratos.add(prato);
        return prato;
    }

    public static Prato getPrato(String name) {
        for (Prato prato : pratos) {
            if (prato.getName() == name) return prato;
        }
        return null;
    }
}
