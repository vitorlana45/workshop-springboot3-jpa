package com.project.lana.course.Service;

import com.project.lana.course.entities.User;
import com.project.lana.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {
    @Autowired // fazendo injeção de dependencia
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
       Optional<User> obj = repository.findById(id);
        return obj.get();
    }

    public User insert (User obj){
        return repository.save(obj);
    }

    public void delete (long id){
        repository.deleteById(id);
    }
}
