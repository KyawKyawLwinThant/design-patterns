package com.demo;

public abstract class PizzaTemplate {

    public final void makePizza(){
        prepared();
        baked();
        topping();
        served();
    }


    public abstract void prepared();
    public abstract void baked();
    public abstract void topping();
    public abstract void served();
}
