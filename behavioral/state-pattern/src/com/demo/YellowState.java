package com.demo;

public class YellowState implements State{
    @Override
    public void doAction(Context context) {
        context.setState(this);
    }

    public String toString(){
        return "Yellow State.";
    }
}
