package com.demo;

public class ConcreteVisitable1 implements IVisitable{

    private String name;

    public ConcreteVisitable1(String name) {
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
