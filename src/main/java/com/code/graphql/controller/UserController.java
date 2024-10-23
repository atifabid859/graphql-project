package com.code.graphql.controller;

import com.code.graphql.entities.User;
import com.code.graphql.service.UserService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;

import java.util.List;

public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @MutationMapping(name = "createUser")
    public User createUser(@Argument String name,@Argument String phone,@Argument String email,@Argument String password){
          User user = new User();
          user.setName(name);
          user.setPhone(phone);
          user.setEmail(email);
          user.setPassword(password);
          return userService.createUser(user);
    }

    @QueryMapping(name = "getUsers")
    public List<User> getAllUsers(){
      return userService.getAllUser();
    }
    @QueryMapping(name = "getUser")
    public User getSingleUser(@Argument int userId){
      return userService.getSingleUser(userId);
    }

    @MutationMapping(name = "deleteUser")
    public boolean deleteUser(@Argument int userId){
        return userService.deleteUser(userId);
    }
}
