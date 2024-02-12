package com.project.lana.course.config;

import com.project.lana.course.entities.User;
import com.project.lana.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired // fazendo uma injeção de dependencia
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
    // tudo que colocar dentro do metodo run será executado quando minha aplicação for executada

        User u1 = new User (null,"Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
