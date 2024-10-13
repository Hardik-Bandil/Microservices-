package com.lcwd.user.services.Controllers;

import com.lcwd.user.services.Services.UserService;
import com.lcwd.user.services.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User user1 = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }


    @GetMapping("/userId")
    public ResponseEntity<User> getSingleUser(@PathVariable Integer userId) {
         User user = userService.getUser(userId);
           return  ResponseEntity.ok(user);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUser() {
        List<User> allUser = userService.getAlluser();
        return ResponseEntity.ok(allUser);
    }


}
