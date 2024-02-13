package com.project.lana.course.resources;

import com.project.lana.course.Service.OrderService;
import com.project.lana.course.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders") // request mapping
public class OrderResource {
    @Autowired
    private OrderService service;


    @GetMapping
    public ResponseEntity<List<Order>> findAll() {
        List<Order> list = service.findAll();
        return ResponseEntity.ok().body(list);

    }

    @GetMapping(value = "/{id}") // assim minha Url vai aceitar um ID dentro da requisição
    public ResponseEntity<Order> findById(@PathVariable Long id) { // PathVariable vai pegar o id vindo pela URL
        Order obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
