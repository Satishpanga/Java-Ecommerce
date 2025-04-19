package com.ecommerce.dao;

import com.ecommerce.model.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    private List<Product> products = new ArrayList<>();
    
    public ProductDao() {
        // Initialize with some sample data
        products.add(new Product("1", "Laptop", "High performance laptop", 999.99, 10));
        products.add(new Product("2", "Smartphone", "Latest smartphone", 699.99, 15));
    }
    
    public List<Product> getAllProducts() {
        return new ArrayList<>(products);
    }
    
    public Product getProductById(String id) {
        return products.stream()
                      .filter(p -> p.getId().equals(id))
                      .findFirst()
                      .orElse(null);
    }
    
    public void addProduct(Product product) {
        products.add(product);
    }
}
