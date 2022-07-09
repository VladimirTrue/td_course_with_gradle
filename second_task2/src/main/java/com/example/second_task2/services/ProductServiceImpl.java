package com.example.second_task2.services;

import com.example.second_task2.dao.ProductRepository;
import com.example.second_task2.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    @Transactional
    public Product saveProduct(Product product) {
        product = productRepository.save(product);
        return product;
    }

    @Override
    public List<Product> findAllProducts() {
        var allProducts = productRepository.findAll();
        return (List<Product>) allProducts;
    }

    @Override
    public Product findProduct(Product product) {
        var productFromDb = productRepository.findById(product.getId()).get();
        return productFromDb;
    }

    @Override
    public Product findProductById(Long id) {
        var productFromDb = productRepository.findById(id);
        return productFromDb.get();
    }

    @Override
    @Transactional
    public String deleteProduct(Product product) {
        productRepository.delete(product);
        return "Product with id: " + product.getId() + " was deleted";
    }

    @Override
    @Transactional
    public String deleteProductById(Long id) {
        productRepository.deleteById(id);
        return "Product with id: " + id + " was deleted";
    }
}
