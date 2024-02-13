package com.project.lana.course.resources;

import com.project.lana.course.Service.UserService;

import com.project.lana.course.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/users") // request mapping
public class UserResource {
    @Autowired
    private UserService service;


    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);

    }

    @GetMapping(value = "/{id}") // assim minha Url vai aceitar um ID dentro da requisição
    public ResponseEntity<User> findById(@PathVariable Long id) { // PathVariable vai pegar o id vindo pela URL
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
