package com.demo;

public class Main {
    public static void main(String[] args) {
        System.out.println("ConcreteVisitable1 is visited.");
        IVisitable iVisitable=new ConcreteVisitable1("Mandalay");
        iVisitable.accept(new ConcreteVisitorB());
        System.out.println();
        System.out.println("ConcreteVisitable2 is visited.");
        iVisitable=new ConcreteVisitable2("Yangon");
        iVisitable.accept(new ConcreteVisitorB());
        System.out.println();
        System.out.println("ConcreteVisitable3Group is visited.");
        iVisitable=new ConcreteVisitable3Group(new IVisitable[]{new ConcreteVisitable1("apple"),
        new ConcreteVisitable1("orange"),new ConcreteVisitable1("cherry")});
        iVisitable.accept(new ConcreteVisitorB());
    }
}
