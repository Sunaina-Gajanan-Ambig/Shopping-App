package com.project.ShoppingApp.controller;

import com.project.ShoppingApp.model.Product;
import com.project.ShoppingApp.repository.ProductRepository;
import com.project.ShoppingApp.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = {"http://127.0.0.1:51853", "http://localhost:9009"}, allowedHeaders = "*", methods = {RequestMethod.GET})
@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductService productService;

@GetMapping
    public List<Product> getAllProducts() {
        return productService.findAll();
    }
////    @GetMapping("/products")
//    public ResponseEntity<List<Product>>getAllProducts(){
//        List<Product>products=productRepository.findAll();
//        return  ResponseEntity.ok().body(products);
//    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product createdProduct1 = productService.save(product);
        return ResponseEntity.ok(createdProduct1);
    }
}
