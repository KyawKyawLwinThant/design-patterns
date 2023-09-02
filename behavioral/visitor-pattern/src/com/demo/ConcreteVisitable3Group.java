package com.demo;

public class ConcreteVisitable3Group implements IVisitable{
    IVisitable[] elements;

    public ConcreteVisitable3Group(IVisitable[] elements) {
        this.elements = elements;
    }

    @Override
    public void accept(IVisitor visitor) {
        for(IVisitable element:elements){
            element.accept(visitor);
        }
        visitor.visit(this);
    }
}
