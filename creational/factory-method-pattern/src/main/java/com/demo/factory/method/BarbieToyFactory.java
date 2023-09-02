package com.demo.factory.method;

public class BarbieToyFactory extends ToyFactoryAbstraction {
    @Override
    public IToy makeToy() {
        return new BarbieToy();
    }
}
