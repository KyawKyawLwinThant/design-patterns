package com.demo.decorator;

public abstract class CoffeeDecorator implements ICoffee{

    protected ICoffee iCoffee;

    public CoffeeDecorator(ICoffee iCoffee) {
        this.iCoffee = iCoffee;
    }
}
