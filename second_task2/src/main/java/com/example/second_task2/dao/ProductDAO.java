package com.example.second_task2.dao;

import com.example.second_task2.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductDAO extends CrudRepository<Product, Long> {

    @Override
    <S extends Product> S save(S entity);

    @Override
    Optional<Product> findById(Long aLong);

    @Override
    Iterable<Product> findAll();

    @Override
    void deleteById(Long aLong);

    @Override
    void delete(Product entity);
}
