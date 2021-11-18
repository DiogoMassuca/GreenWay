package com.example.p1.controllers;

import java.util.Optional;

import com.example.p1.models.Restaurante;
import com.example.p1.models.exceptions.NotFoundException;
import com.example.p1.models.repositories.RestauranteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/restaurantes")
public class RestauranteController 
{
    @Autowired
    private RestauranteRepository restauranteRepository;
    @GetMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
   public Iterable<Restaurante>getRestaurantes() {
       return restauranteRepository.findAll();
   }

   @GetMapping(path = "/{id:[0-9]+}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Restaurante getRestaurante(@PathVariable int id) {
        Optional<Restaurante> _restaurante = restauranteRepository.findById(id);
        if (!_restaurante.isPresent()) throw
                new NotFoundException("" + id, "Restaurante", "id");
        else
            return _restaurante.get();
    }

   @GetMapping(path = "/not/{name}", produces= MediaType.APPLICATION_JSON_VALUE)
   public String getResNoAli1(@PathVariable String name) {
       return restauranteRepository.getResNoAli1();
   }


}

