package com.mini2.springbootmicroservice2order.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "userId",  nullable = false)
    private Long userId;

    @Column(name = "productId", nullable = false)
    private Long productId;

    @Column(name = "shipping", nullable = false)
    private String shipping;

    @Column(name = "payment", nullable = false)
    private String payment;

    @Column(name = "order_time", nullable = false )
    private LocalDateTime orderTime;
}
