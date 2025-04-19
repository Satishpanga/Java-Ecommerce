package com.ecommerce;

import com.ecommerce.service.ProductService;
import com.ecommerce.service.UserService;

public class Main {
    public static void main(String[] args) {
        System.out.println("E-Commerce Platform Starting...");
        
        // Initialize services
        UserService userService = new UserService();
        ProductService productService = new ProductService();
        
        // Application logic would go here
    }
}
