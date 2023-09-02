package com.demo.builder;

import java.time.LocalDate;

public class Product {
    private String name;
    private String description;
    private int quantity;
    private LocalDate lastUpdated;
    private double price;

    public Product(){}

    public Product(String name, String description, int quantity, LocalDate lastUpdated, double price) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.lastUpdated = lastUpdated;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", lastUpdated=" + lastUpdated +
                ", price=" + price +
                '}';
    }
}
