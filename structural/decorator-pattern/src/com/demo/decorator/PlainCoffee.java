package com.demo.decorator;

public class PlainCoffee implements ICoffee{
    @Override
    public String makeCoffee() {
        return "Plain Coffee";
    }
}
