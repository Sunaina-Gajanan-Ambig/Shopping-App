package com.project.ShoppingApp.services;

import com.project.ShoppingApp.model.Product;
import com.project.ShoppingApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Service

public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        List<Product> products = productRepository.findAll();
        System.out.println("Fetched products: " + products);
        return products;
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    // Additional methods for product operations can be added
}
