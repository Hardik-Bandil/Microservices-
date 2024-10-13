package com.lcwd.user.services.Services.impl;

import com.lcwd.rating.RatingService.entities.Rating;
import com.lcwd.user.services.Services.UserService;
import com.lcwd.user.services.entities.User;
import com.lcwd.user.services.repositories.UserRepositories;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;
@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserRepositories userRepositories;

    @Override
    public User saveUser(User user) {
        Random random = new Random();
        int userId = random.nextInt();
        user.setUserId(userId);
        return userRepositories.save(user);
    }

    @Override
    public List<User> getAlluser() {
        return userRepositories.findAll();
    }

    @Override
    public User getUser(Integer userId) {
        return null;
    }




}
