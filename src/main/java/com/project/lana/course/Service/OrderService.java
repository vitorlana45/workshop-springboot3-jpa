package com.project.lana.course.Service;

import com.project.lana.course.entities.Order;
import com.project.lana.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired // fazendo injeção de dependencia
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
       Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
