package com.ifinancial.controller;

import com.ifinancial.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/home")
public class UserController {

    @GetMapping
    public ResponseEntity<User> home() {
        return ResponseEntity.ok(new User("lele", "gustav"));
    }
}
