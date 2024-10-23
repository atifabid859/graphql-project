package com.code.graphql.service;

import com.code.graphql.entities.Order;
import com.code.graphql.entities.User;

import java.util.List;

public interface OrderService {
//create order
    Order createUser(Order order);

    //gettAllOrder list
    List<Order> getAllUser();

    //getting single user
    Order getSingleUser(int orderId);

    //update Order
    Order updateUser(Order order,int orderId);

    //delete Order

    public boolean deleteUser(int orderId);
}
