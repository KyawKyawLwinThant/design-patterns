package com.demo;

public interface IVisitor {

    void visit(ConcreteVisitable1 concreteVisitable1);
    void visit(ConcreteVisitable2 concreteVisitable2);

    void visit(ConcreteVisitable3Group concreteVisitable3Group);

}
