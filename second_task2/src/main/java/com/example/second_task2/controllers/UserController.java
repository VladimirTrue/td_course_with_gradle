package com.example.second_task2.controllers;

import com.example.second_task2.entity.User;
import com.example.second_task2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


    @Autowired
    private UserService userService;


    @PostMapping("/add_user")
    public User addNewUser(@RequestBody User user) {
        var userResponse = userService.saveUser(user);
        return userResponse;
    }

    @GetMapping("/get_all_users")
    public List<User> getAllUsers() {
        var allUsers = userService.findAllUsers();
        return allUsers;
    }

    @GetMapping("/get/{id}")
    public User getUserById(@PathVariable Long id) {
        var user = userService.findUserById(id);
        return user;
    }

    @PostMapping("/delete_user/{id}")
    public String deleteUserById(@PathVariable Long id){
        var responseStr = userService.deleteUserByID(id);
        return responseStr;
    }

}
