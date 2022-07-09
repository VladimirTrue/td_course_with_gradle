package com.example.second_task2.dao;

import com.example.second_task2.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
