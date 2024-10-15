package com.lcwd.user.services.Services.impl;

import com.lcwd.user.services.Services.UserService;
import com.lcwd.user.services.entities.User;
import com.lcwd.user.services.exceptions.ResourceNotFoundException;
import com.lcwd.user.services.repositories.UserRepositories;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;
@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserRepositories userRepositories;

    @Autowired
    private RestTemplate restTemplate;

    private Logger logger = LoggerFactory.getLogger(UserServiceimpl.class);

    @Override
    public User saveUser(User user) {
        Random random = new Random();
        String userId = random.toString();
        user.setUserId(userId);
        return userRepositories.save(user);
    }

    @Override
    public List<User> getAlluser() {
        return userRepositories.findAll();
    }

    @Override
    public User getUser(String userId) {
        User user = userRepositories.findById(userId).orElseThrow(()-> new ResourceNotFoundException());

        //http://localhost:8092/ratings/users/1
       ArrayList forObject = restTemplate.getForObject( "http://localhost:8092/ratings/users/java.util.Random@7f26d56a", ArrayList.class);
        logger.info("", forObject);
        user.setRatings(forObject);
        return user;
    }

}
