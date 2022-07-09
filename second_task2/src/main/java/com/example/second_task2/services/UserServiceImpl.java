package com.example.second_task2.services;

import com.example.second_task2.dao.UserRepository;
import com.example.second_task2.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public User saveUser(User user) {
        user = userRepository.save(user);
        return user;
    }

    @Override
    public List<User> findAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User findUser(User user) {
        var userFromDB = userRepository.findById(user.getId()).get();
        return userFromDB;
    }

    @Override
    public User findUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow();
        return user;
    }

    @Override
    @Transactional
    public String deleteUser(User user) {
        userRepository.delete(user);
        return "User with id: " + user.getId() + " was deleted";
    }

    @Override
    @Transactional
    public String deleteUserByID(Long id) {
        userRepository.deleteById(id);
        return "User with id: " + id + " was deleted";
    }
}
