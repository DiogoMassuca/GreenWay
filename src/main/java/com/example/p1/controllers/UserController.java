package com.example.p1.controllers;

import java.util.Optional;

import com.example.p1.models.User;
import com.example.p1.models.exceptions.NotFoundException;
import com.example.p1.models.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/api/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    
   @GetMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
   public Iterable<User>getUsers() {
       return userRepository.findAll();
   }

   @GetMapping(path = "/{id:[0-9]+}", produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUser(@PathVariable int id) {
        Optional<User> _user = userRepository.findById(id);
        if (!_user.isPresent()) throw
                new NotFoundException("" + id, "User", "id");
        else
            return _user.get();
    }

    @PostMapping(path = "/created", produces = MediaType.APPLICATION_JSON_VALUE)
    public void saveStudent(@RequestBody User userId) {
        Integer inserted = userRepository.createUser(userId);
    }
}
