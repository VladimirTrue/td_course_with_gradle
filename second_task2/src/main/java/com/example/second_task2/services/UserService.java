package com.example.second_task2.services;

import com.example.second_task2.entity.User;

import java.util.List;

public interface UserService {

    public void save(User user);

    public List<User> findAll();

}
