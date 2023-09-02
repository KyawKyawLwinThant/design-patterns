package com.demo.decorator;

public class ToppingDecorator extends CoffeeDecorator{
    public ToppingDecorator(ICoffee iCoffee) {
        super(iCoffee);
    }

    @Override
    public String makeCoffee() {
        return iCoffee.makeCoffee() + " Topping";
    }
}
