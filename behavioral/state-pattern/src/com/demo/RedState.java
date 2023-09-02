package com.demo;

public class RedState implements State{
    @Override
    public void doAction(Context context) {
        context.setState(this);
    }

    public String toString(){
        return "Red State.";
    }
}
