package com.ecommerce.model;

public class Product {
    private String id;
    private String name;
    private String description;
    private double price;
    private int stock;

    // Constructors, getters, and setters
    public Product(String id, String name, String description, double price, int stock) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    // Getters and setters for all fields
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    // ... other getters and setters
}
