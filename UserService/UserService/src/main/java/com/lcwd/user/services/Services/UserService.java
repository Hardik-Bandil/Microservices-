package com.lcwd.user.services.Services;

import com.lcwd.user.services.entities.User;

import java.util.List;

public interface UserService {



        User saveUser(User user);

        List<User> getAlluser();

        User getUser(Integer userId);




}
