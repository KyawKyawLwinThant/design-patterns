package com.demo.decorator;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(ICoffee iCoffee) {
        super(iCoffee);
    }

    @Override
    public String makeCoffee() {
        return iCoffee.makeCoffee() + " Sugar";
    }
}
