package com.example.TP_Formation.controller;

import com.example.TP_Formation.model.Product;
import com.example.TP_Formation.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    // lister tous les produits
    @GetMapping
    public List<Product> getAll() {
        return productService.getAllProducts();
    }

    // creer un produit
    @PostMapping
    public Product create(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    // recuperer par id
    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id) {
        return productService.getProductById(id);
    }
}
