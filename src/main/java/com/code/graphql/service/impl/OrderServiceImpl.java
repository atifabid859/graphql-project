package com.code.graphql.service.impl;

import com.code.graphql.entities.Order;
import com.code.graphql.helper.ExceptionHellper;
import com.code.graphql.repository.OrderRepository;
import com.code.graphql.repository.UserRepository;
import com.code.graphql.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order createUser(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getAllUser() {
        return orderRepository.findAll();
    }

    @Override
    public Order getSingleUser(int orderId) {
        return orderRepository.findById(orderId).orElseThrow(ExceptionHellper::throughResourceException);
    }

    @Override
    public Order updateUser(Order order, int orderId) {
        return orderRepository.save(order);
    }

    @Override
    public boolean deleteUser(int orderId) {
        orderRepository.findById(orderId).orElseThrow(ExceptionHellper::throughResourceException);
        return true;
    }


}
