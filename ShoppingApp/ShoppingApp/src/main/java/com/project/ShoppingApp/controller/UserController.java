package com.project.ShoppingApp.controller;


import com.project.ShoppingApp.model.User;
import com.project.ShoppingApp.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://127.0.0.1:51853", "http://localhost:9009"}, allowedHeaders = "*", methods = {RequestMethod.GET})
@RequestMapping("/a/users")
public class UserController {
    @Autowired
    private UserServices userServices;

    @GetMapping
    public List<User> getAllUsers() {
        return userServices.findAll();
    }

//    @PostMapping
//    public ResponseEntity<User> createUser(@RequestBody User user) {
//        User createdUser = userServices.save(user);
//        return ResponseEntity.ok(createdUser);
//    }
}
