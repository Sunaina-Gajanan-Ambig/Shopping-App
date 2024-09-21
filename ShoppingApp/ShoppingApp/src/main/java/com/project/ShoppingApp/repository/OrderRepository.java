package com.project.ShoppingApp.repository;

import com.project.ShoppingApp.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}