package com.demo;

public class Helicopter extends Vehicle{

    public Helicopter(){
        setGoAlgorithm(new GoByFlyingAlgo());
    }
}
