package com.demo.factory.method;

public class Main {
    public static void main(String[] args) {
        ToyFactoryAbstraction toyFactory=new RobotToyFactory();
        IToy toy=toyFactory.makeToy();
        System.out.println(toy.makeToy());

        RobotToy robotToy=new RobotToy();
        System.out.println(robotToy.makeToy());
    }
}
