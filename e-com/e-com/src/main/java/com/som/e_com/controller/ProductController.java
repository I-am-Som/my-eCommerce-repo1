package com.som.e_com.controller;

import com.som.e_com.model.Product;
import com.som.e_com.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping
    public String greet() {
        return "Hello world";
    }

    @GetMapping("/products")
    public List<Product> getallproducts() {
        return service.getAllProducts();
    }
}
