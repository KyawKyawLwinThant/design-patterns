package com.demo;

public class Main {
    public static void main(String[] args) {
        BackendLayer backendLayer=new BackendLayer();
        MiddleLayer middleLayer=new MiddleLayer(backendLayer);
        FrontEndLayer frontEndLayer=new FrontEndLayer(middleLayer);
        frontEndLayer.help(2);
    }
}
