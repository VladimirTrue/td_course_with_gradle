package com.example.second_task2;

import com.example.second_task2.entity.User;
import com.example.second_task2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class Controller {


    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hello() {
        return new String("HELLO!");
    }

    @PostMapping("/users")
    public User addNewUser(@RequestBody User user) {

        userService.save(user);
        return user;
    }

    @GetMapping("/users")
    public List<User> getAllusers() {
        List<User> allusers = userService.findAll();
        return allusers;
    }

}
