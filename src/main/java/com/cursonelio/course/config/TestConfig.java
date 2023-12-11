package com.cursonelio.course.config;

import com.cursonelio.course.entities.User;
import com.cursonelio.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Thiago Santos", "thiago@gmail.com", "82987063937", "123456");
        User u2 = new User(null, "Jose Silva", "jose@gmail.com", "82987456241", "123458");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
