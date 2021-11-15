package com.example.p1.controllers;

import java.util.Optional;

import com.example.p1.models.Prato;
import com.example.p1.models.exceptions.NotFoundException;
import com.example.p1.models.repositories.PratoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/pratos")
public class PratoController {

    @Autowired
    private PratoRepository pratoRepository;

    @GetMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
   public Iterable<Prato>getPratos() {
       return pratoRepository.findAll();
   }

   @GetMapping(path = "/{id:[0-9]+}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Prato getPrato(@PathVariable int id) {
        Optional<Prato> _prato = pratoRepository.findById(id);
        if (!_prato.isPresent()) throw
                new NotFoundException("" + id, "Prato", "id");
        else
            return _prato.get();
    }
}
