package com.mini2.springbootmicroservice2order.controller;

import com.mini2.springbootmicroservice2order.model.Order;
import com.mini2.springbootmicroservice2order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/order")//pre-path
public class orderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<?> saveOrder (@RequestBody Order order) {
        return new ResponseEntity<>(orderService.saveOrder(order), HttpStatus.CREATED);
    }

    @GetMapping("{userId}")
    public ResponseEntity<?> getAllOrdersOfUser(@PathVariable Long userId) {
        return ResponseEntity.ok(orderService.findAllOrderOfUser(userId));
    }
}
