package com.demo.factory.method;

public class RobotToyFactory extends ToyFactoryAbstraction{
    @Override
    public IToy makeToy() {
        return new RobotToy();
    }
}
