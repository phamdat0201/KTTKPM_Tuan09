package com.example.RedisCRUD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RedisCRUD.entity.Product;
import com.example.RedisCRUD.service.ProductService;

@RestController
@RequestMapping("crud/")
public class ProductController {

	@Autowired
    private ProductService productService;

    @GetMapping("get-by-id/{id}")
    public Product getById(@PathVariable long id){
        return productService.findById(id);
    }

    @PostMapping("/create")
    public Product create(@RequestBody  Product product){
        return productService.save(product);
    }
}
