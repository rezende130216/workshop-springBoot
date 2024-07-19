package com.microservice.curso.resources;

import com.microservice.curso.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1L, "Guilherme", "teste@teste.com","43-984021676", "123");
        return ResponseEntity.ok().body(user);
    }
}
