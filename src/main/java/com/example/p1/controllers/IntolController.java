package com.example.p1.controllers;

import com.example.p1.models.Intol;
import com.example.p1.models.repositories.IntolRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/intols")
public class IntolController {

    @Autowired
    private IntolRepository intolRepository;

    @GetMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
   public Iterable<Intol>getIntols() {
       return intolRepository.findAll();
   }
}
