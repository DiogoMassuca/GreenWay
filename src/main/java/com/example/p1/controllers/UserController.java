package com.example.p1.controllers;

import java.util.List;

import com.example.p1.models.User;
import com.example.p1.models.exceptions.NotFoundException;
import com.example.p1.models.repositories.UserRepository;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/api/users")
public class UserController {
   @GetMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
   public List<User>getUsers() {
       return UserRepository.getAllUsers();
   }

   @GetMapping(path = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
   public User getUser(@PathVariable("id")int id) throws NotFoundException{
       User user = UserRepository.getUser(id);
       if (user != null)
            return user;
        else
            throw new NotFoundException("User " + id + "not found.", null, null);

   }
}
