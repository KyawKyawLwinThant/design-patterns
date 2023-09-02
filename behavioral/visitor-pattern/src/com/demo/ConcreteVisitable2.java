package com.demo;

public class ConcreteVisitable2 implements IVisitable{
    private String name;

    public ConcreteVisitable2(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
