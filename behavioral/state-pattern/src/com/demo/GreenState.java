package com.demo;

public class GreenState implements State{
    @Override
    public void doAction(Context context) {
        context.setState(this);
    }

    public String toString(){
        return "Green State.";
    }
}
