package com.cursonelio.course.config;

import com.cursonelio.course.entities.Order;
import com.cursonelio.course.entities.User;
import com.cursonelio.course.repositories.OrderRepository;
import com.cursonelio.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Thiago Santos", "thiago@gmail.com", "82987063937", "123456");
        User u2 = new User(null, "Jose Silva", "jose@gmail.com", "82987456241", "123458");

        Order o1 = new Order(null, Instant.parse("2023-12-11T18:37:10Z"), u1);
        Order o2 = new Order(null, Instant.parse("2023-10-25T10:24:45Z"), u2);
        Order o3 = new Order(null, Instant.parse("2023-12-11T07:50:36Z"), u1);

        userRepository.saveAll(Arrays.asList(u1,u2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));
    }

}
