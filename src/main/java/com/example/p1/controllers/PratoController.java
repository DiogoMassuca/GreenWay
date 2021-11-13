package com.example.p1.controllers;

import com.example.p1.models.Prato;
import com.example.p1.models.repositories.PratoRepository;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/pratos")
public class PratoController {
    private PratoRepository pratoRepository;
    @GetMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
   public Iterable<Prato>getPratos() {
       return pratoRepository.findAll();
   }

}
