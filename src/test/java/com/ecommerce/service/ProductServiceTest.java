package com.ecommerce.service;

import com.ecommerce.model.Product;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductServiceTest {
    @Test
    public void testGetAllProducts() {
        ProductService service = new ProductService();
        assertEquals(2, service.getAllProducts().size());
    }
    
    @Test
    public void testGetProductById() {
        ProductService service = new ProductService();
        Product product = service.getProductById("1");
        assertNotNull(product);
        assertEquals("Laptop", product.getName());
    }
}
