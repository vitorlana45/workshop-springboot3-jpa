package com.project.lana.course.resources;

import com.project.lana.course.Service.CategoryService;
import com.project.lana.course.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/categories") // request mapping
public class CategoryResource {
    @Autowired
    private CategoryService service;


    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = service.findAll();
        return ResponseEntity.ok().body(list);

    }

    @GetMapping(value = "/{id}") // assim minha Url vai aceitar um ID dentro da requisição
    public ResponseEntity<Category> findById(@PathVariable Long id) { // PathVariable vai pegar o id vindo pela URL
        Category obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
