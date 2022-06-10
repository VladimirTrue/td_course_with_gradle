package com.example.second_task2.controllers;

import com.example.second_task2.entity.Product;
import com.example.second_task2.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add_product")
    public Product addNewProduct(@RequestBody Product product) {
        var responseProduct = productService.saveProduct(product);
        return responseProduct;
    }

    @GetMapping("/get_all_products")
    public List<Product> getAllProducts() {
        var allProducts = productService.findAllProducts();
        return (List<Product>) allProducts;
    }

    @GetMapping("/get/{id}")
    public Product getProductById(@PathVariable Long id){
        var product = productService.findProductById(id);
        return product;
    }

    @PostMapping("/delete/{id}")
    public String deleteProductById(@PathVariable Long id){
        var responseStr = productService.deleteProductById(id);
        return responseStr;
    }
}
