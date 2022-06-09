package com.example.second_task2.services;

import com.example.second_task2.entity.User;

import java.util.List;

public interface UserService {

    public User saveUser(User user);

    public List<User> findAllUsers();

    public User findUser(User user);

    public User findUserById(Long id);

    public String deleteUser(User user);

    public String deleteUserByID(Long id);



}
