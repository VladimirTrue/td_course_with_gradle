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

    @GetMapping("/hello")
    public String hello() {
        return new String("HELLO!");
    }

    @PostMapping("/add_user")
    public User addNewUser(@RequestBody User user) {
        userService.save(user);
        return user;
    }

    @GetMapping("/get_all_users")
    public List<User> getAllUsers() {
        List<User> allUsers = userService.findAll();
        return allUsers;
    }

    @GetMapping("get_user/{id}")
    public User getUserById(@PathVariable Long id) {
        User user = userService.findUserById(id);
        return user;
    }

    @PostMapping("delete_user/{id}")
    public String deleteUserById(@PathVariable Long id){
        userService.deleteUserByID(id);
        return "User with id: " + id + " was deleted";
    }

}
