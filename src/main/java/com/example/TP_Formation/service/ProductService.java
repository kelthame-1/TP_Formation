package com.example.TP_Formation.service;

import com.example.TP_Formation.model.Product;
import com.example.TP_Formation.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    //Lister les produits
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // save product
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    // get par id
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }
}
