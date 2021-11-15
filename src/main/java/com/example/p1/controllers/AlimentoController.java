package com.example.p1.controllers;


import java.util.Optional;

import com.example.p1.models.Alimento;
import com.example.p1.models.exceptions.NotFoundException;
import com.example.p1.models.repositories.AlimentoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/alimentos")
public class AlimentoController {
    
    @Autowired
    private AlimentoRepository alimentoRepository;
    @GetMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
   public Iterable<Alimento>getAlimentos() {
       return alimentoRepository.findAll();
   }

   @GetMapping(path = "/{id:[0-9]+}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Alimento getAlimento(@PathVariable int id) {
        Optional<Alimento> _alimento = alimentoRepository.findById(id);
        if (!_alimento.isPresent()) throw
                new NotFoundException("" + id, "Alimento", "id");
        else
            return _alimento.get();
    }
}
