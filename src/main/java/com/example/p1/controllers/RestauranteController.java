package com.example.p1.controllers;

import java.util.List;

import com.example.p1.models.Restaurante;
import com.example.p1.models.repositories.RestauranteRepository;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/alimento")
public class RestauranteController {
    @GetMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
   public List<Restaurante>getRestaurantes() {
       return RestauranteRepository.getAllRestaurantes();
   }

}
