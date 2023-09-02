package com.demo.decorator;

public class CreamerDecorator extends CoffeeDecorator{
    public CreamerDecorator(ICoffee iCoffee) {
        super(iCoffee);
    }

    @Override
    public String makeCoffee() {
        return iCoffee.makeCoffee() + " Creamer";
    }
}
