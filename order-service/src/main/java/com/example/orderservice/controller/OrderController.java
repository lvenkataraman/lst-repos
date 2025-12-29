package com.example.orderservice.controller;

import com.example.orderservice.model.Order;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private Map<String, Order> orderRepository = new HashMap<>();

    @GetMapping("/{orderNumber}")
    public Order getOrder(@PathVariable String orderNumber) {
        return orderRepository.get(orderNumber);
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        if (order.getOrderDate() == null) {
            order.setOrderDate(LocalDate.now());
        }
        orderRepository.put(order.getOrderNumber(), order);
        return order;
    }

    @DeleteMapping("/{orderNumber}")
    public void deleteOrder(@PathVariable String orderNumber) {
        orderRepository.remove(orderNumber);
    }

    @PostMapping("/{orderNumber}")
    public Order modifyOrder(@PathVariable String orderNumber, @RequestBody Order order) {
        order.setOrderNumber(orderNumber);
        orderRepository.put(orderNumber, order);
        return order;
    }
}
