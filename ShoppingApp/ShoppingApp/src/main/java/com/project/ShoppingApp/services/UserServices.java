package com.project.ShoppingApp.services;

import com.project.ShoppingApp.model.Product;
import com.project.ShoppingApp.model.User;
import com.project.ShoppingApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class UserServices {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        List<User>users=userRepository.findAll();
        return users;
    }
//    public List<Product> findAll() {
//        List<Product> products = productRepository.findAll();
//        System.out.println("Fetched products: " + products);
//        return products;
//    }

    public User save(User user) {
        return userRepository.save(user);
    }

    // Additional methods for user operations can be added
}

