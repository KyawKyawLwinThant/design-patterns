package com.demo;

public class ChicagoPizza extends PizzaTemplate{
    @Override
    public void prepared() {
        System.out.println(this.getClass().getSimpleName() + " prepared.");
    }

    @Override
    public void baked() {
        System.out.println(this.getClass().getSimpleName() + " baked.");
    }

    @Override
    public void topping() {
        System.out.println(this.getClass().getSimpleName() + " topping.");
    }

    @Override
    public void served() {
        System.out.println(this.getClass().getSimpleName() + " served.");
    }
}
