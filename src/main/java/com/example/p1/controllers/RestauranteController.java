package com.example.p1.controllers;

import com.example.p1.models.Restaurante;
import com.example.p1.models.exceptions.NotFoundException;
import com.example.p1.models.repositories.RestauranteRepository;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/resturante")
public class RestauranteController {
    private RestauranteRepository restauranteRepository;
    @GetMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
   public Iterable<Restaurante>getRestaurantes() {
       return restauranteRepository.findAll();
   }

@GetMapping(path = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
 public Restaurante getRestaurante(@PathVariable("id")int id) throws NotFoundException{
     Restaurante restaurante = RestauranteRepository.getRestaurante(id);
    if (restaurante != null)
           return restaurante;
     else
          throw new NotFoundException("Restaurante " + id + "not found.", null, null);
}
}
