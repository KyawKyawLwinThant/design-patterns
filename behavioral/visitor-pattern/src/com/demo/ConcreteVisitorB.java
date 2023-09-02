package com.demo;

public class ConcreteVisitorB implements IVisitor{
    @Override
    public void visit(ConcreteVisitable1 concreteVisitable1) {
        System.out.println(this.getClass().getSimpleName()+
                " visiting ConcreteVisitable1 , name is ::"+ concreteVisitable1.getName());
    }

    @Override
    public void visit(ConcreteVisitable2 concreteVisitable2) {
        System.out.println(this.getClass().getSimpleName()+
                " visiting ConcreteVisitable2 , name is ::"+ concreteVisitable2.getName());
    }

    @Override
    public void visit(ConcreteVisitable3Group concreteVisitable3Group) {
        System.out.println(this.getClass().getSimpleName()+
                " visiting ConcreteVisitable3Group , name is ::"+ concreteVisitable3Group.getClass().getSimpleName());
    }
}
