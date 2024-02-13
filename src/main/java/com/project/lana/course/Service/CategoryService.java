package com.project.lana.course.Service;



import com.project.lana.course.entities.Category;
import com.project.lana.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CategoryService {
    @Autowired // fazendo injeção de dependencia
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
       Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
