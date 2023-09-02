package com.demo;

public class RealSubject implements ISubject{
    @Override
    public void doSomething1(Object a, Object b) {
        System.out.println("RealOperator: doSomething1() called.");
    }

    @Override
    public void doSomething2(Object a) {
        System.out.println("RealOperator: doSomething2() called.");
    }
}
