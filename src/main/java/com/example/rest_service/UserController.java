package com.example.rest_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/users")
    public User user(@RequestParam(defaultValue = "0") long id , @RequestParam(defaultValue = "Shreya") String name){
        return new User(id,name);
    }
}
