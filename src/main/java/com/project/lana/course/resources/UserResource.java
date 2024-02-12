package com.project.lana.course.resources;

import com.project.lana.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= "/users") // request mapping
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){

        User u = new User(1L,"maria", "maria@gmail.com", "23123","2123VL");

        return ResponseEntity.ok().body(u);

    }



}
