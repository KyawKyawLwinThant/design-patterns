package com.demo;

public class Jet extends Vehicle{

    public Jet(){
        setGoAlgorithm(new LandingNowAlgo());
    }
}
