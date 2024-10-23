package com.code.graphql.service;

import com.code.graphql.entities.User;

import java.util.List;

public interface UserService {

    //create user

    User createUser(User user);

    //gettAllUser list
    List<User> getAllUser();

    //getting single user
    User getSingleUser(int userId);

    //update user
    User updateUser(User user,int userId);

    //delete user

    public boolean deleteUser(int userId);
}
