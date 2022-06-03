package com.mini2.springbootmicroservice2order.service;

import com.mini2.springbootmicroservice2order.model.Order;
import com.mini2.springbootmicroservice2order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order saveOrder(Order order) {
        order.setOrderTime(LocalDateTime.now());
        return orderRepository.save(order);
    }
    @Override
    public List<Order> findAllOrderOfUser(Long userId) {
        return orderRepository.findAllByUserId(userId);
    }
}
