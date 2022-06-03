package com.mini2.springbootmicroservice2order.service;

import com.mini2.springbootmicroservice2order.model.Order;

import java.util.List;

public interface OrderService {
    Order saveOrder(Order order);

    List<Order> findAllOrderOfUser(Long userId);
}
