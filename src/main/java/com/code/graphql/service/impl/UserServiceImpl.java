package com.code.graphql.service.impl;

import com.code.graphql.entities.User;
import com.code.graphql.helper.ExceptionHellper;
import com.code.graphql.repository.UserRepository;
import com.code.graphql.service.UserService;
import org.hibernate.internal.util.ExceptionHelper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getSingleUser(int userId) {
        return userRepository.findById(userId).orElseThrow(ExceptionHellper::throughResourceException);
    }

    @Override
    public User updateUser(User user, int userId) {
        return null;
    }

    @Override
    public boolean deleteUser(int userId) {
        User user = userRepository.findById(userId).orElseThrow(ExceptionHellper::throughResourceException);
        userRepository.delete(user);
        return true;
    }


}
