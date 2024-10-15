package com.lcwd.user.services.Controllers;

import com.lcwd.user.services.Services.UserService;
import com.lcwd.user.services.entities.User;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    @Operation(summary = "to add the user")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User user1 = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }


    @GetMapping("/userId/{userId}")
    public ResponseEntity<User> getSingleUser(@PathVariable String userId) {
         User user = userService.getUser(userId);
           return  ResponseEntity.ok(user);
    }

    @GetMapping("/getAllUser")
   @Operation(summary = "to get all the user")
    public ResponseEntity<List<User>> getAllUser() {
        List<User> allUser = userService.getAlluser();
        return ResponseEntity.ok(allUser);
    }

}
