package com.demo.decorator;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(ICoffee iCoffee) {
        super(iCoffee);
    }

    @Override
    public String makeCoffee() {
        return iCoffee.makeCoffee() + " Milk";
    }
}
