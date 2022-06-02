package com.example.second_task2.dao;

import com.example.second_task2.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends CrudRepository<User, Long> {

    @Override
    <S extends User> S save(S entity);

    @Override
    Iterable<User> findAll();
}
