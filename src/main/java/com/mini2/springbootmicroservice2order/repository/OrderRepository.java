package com.mini2.springbootmicroservice2order.repository;

import com.mini2.springbootmicroservice2order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findAllByUserId(Long userId);
}
