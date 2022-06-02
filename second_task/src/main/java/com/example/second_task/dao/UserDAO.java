package com.example.second_task.dao;

import com.example.second_task.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDAO {

    void add();

    String getById();

    List<User> getAll();

}
