package com.demo.builder;

import java.time.LocalDate;

public class ProductBuilder {
    private Product product;

    public ProductBuilder create(){
        product=new Product();
        return this;
    }
    public Product build(){
        return product;
    }

    public ProductBuilder addName(String name){
        product.setName(name);
        return this;
    }
    public ProductBuilder addPrice(double price){
        product.setPrice(price);
        return this;
    }
    public ProductBuilder addDescription(String description){
        product.setDescription(description);
        return this;
    }
    public ProductBuilder addUpdatedDate(LocalDate updatedDate){
        product.setLastUpdated(updatedDate);
        return this;
    }
    public ProductBuilder addQuantity(int quantity){
        product.setQuantity(quantity);
        return this;
    }

}
