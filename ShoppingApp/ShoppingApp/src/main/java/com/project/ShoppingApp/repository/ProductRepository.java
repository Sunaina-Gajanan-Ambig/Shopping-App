package com.project.ShoppingApp.repository;

import com.project.ShoppingApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}
