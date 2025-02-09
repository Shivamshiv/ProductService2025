package com.example.productservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @GetMapping("/products/{id}")
    public void getProductById(@PathVariable("id") Integer id) {    //Path var way to get params

    }

    @PostMapping("/products")
    public void createProduct() {

    }

    @GetMapping("/products")
    public void getAllProducts() {

    }

    @PutMapping("/products/{id}")
    public void updateProductById(@PathVariable("id") Integer id) {

    }

    @DeleteMapping("/products/{id}")
    public void deleteProductById(@PathVariable("id") Integer id) {

    }
}
