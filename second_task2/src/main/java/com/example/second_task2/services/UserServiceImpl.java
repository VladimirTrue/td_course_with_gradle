package com.example.second_task2.services;

import com.example.second_task2.dao.UserDAO;
import com.example.second_task2.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Transactional
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public List<User> findAll() {
        return (List<User>) userDAO.findAll();
    }
}
