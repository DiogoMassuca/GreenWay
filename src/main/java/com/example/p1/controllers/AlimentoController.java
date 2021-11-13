package com.example.p1.controllers;


import com.example.p1.models.Alimento;
import com.example.p1.models.repositories.AlimentoRepository;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/alimentos")
public class AlimentoController {
    private AlimentoRepository alimentoRepository;
    @GetMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
   public Iterable<Alimento>getAlimentos() {
       return alimentoRepository.findAll();
   }
}
