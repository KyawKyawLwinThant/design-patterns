package com.demo;

public abstract class Component {
    private String name;

    public Component(){

    }

    public Component(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract void printTree();
}
