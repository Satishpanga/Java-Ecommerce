package com.ecommerce.service;

import com.ecommerce.dao.ProductDao;
import com.ecommerce.model.Product;
import java.util.List;

public class ProductService {
    private ProductDao productDao;
    
    public ProductService() {
        this.productDao = new ProductDao();
    }
    
    public List<Product> getAllProducts() {
        return productDao.getAllProducts();
    }
    
    public Product getProductById(String id) {
        return productDao.getProductById(id);
    }
    
    public void addProduct(Product product) {
        productDao.addProduct(product);
    }
}
