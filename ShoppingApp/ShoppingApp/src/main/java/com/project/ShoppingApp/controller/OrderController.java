package com.project.ShoppingApp.controller;

import com.project.ShoppingApp.model.Order;
import com.project.ShoppingApp.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@CrossOrigin(origins = {"http://127.0.0.1:51853", "http://localhost:9009"}, allowedHeaders = "*", methods = {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/getorders")
    public ResponseEntity<List<Order>> getAllOrders() {
        List<Order> orders = orderService.findAll();
        return ResponseEntity.ok(orders);
    }

//    @PostMapping("add/{id}")
//    public ResponseEntity<Order> getOrderById(@PathVariable Long id) {
//        Order order = orderService.findById(id);
//        if (order == null) {
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(order);
//    }


    @PostMapping("/createorder")
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        Order createdOrder = orderService.save(order);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdOrder);
    }

//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteOrder(@PathVariable Long id) {
//        if (!orderService.existsById(id)) {
//            return ResponseEntity.notFound().build();
//        }
//        orderService.deleteById(id);
//        return ResponseEntity.noContent().build();
//    }
}