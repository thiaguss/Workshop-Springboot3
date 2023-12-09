package com.cursonelio.course.resources;

import com.cursonelio.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "thiago", "thiago@gmail.com", "95959595", "4545454545");
        return ResponseEntity.ok().body(u);
    }
}
