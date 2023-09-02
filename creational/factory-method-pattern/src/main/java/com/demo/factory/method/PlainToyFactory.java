package com.demo.factory.method;

public class PlainToyFactory extends ToyFactoryAbstraction{
    @Override
    public IToy makeToy() {

        return new PlainToy();
    }
}
