package com.example.second_task2.services;

import com.example.second_task2.entity.Product;

import java.util.List;

public interface ProductService {

    public Product saveProduct(Product product);

    public List<Product> findAllProducts();

    public Product findProduct(Product product);

    public Product findProductById(Long id);

    public String deleteProduct(Product product);

    public String deleteProductById(Long id);


}
