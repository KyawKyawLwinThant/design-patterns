package com.demo;

public class Main {
    public static void main(String[] args) {
        Context context=new Context();

        YellowState yellowState=new YellowState();
        yellowState.doAction(context);

        System.out.println("Current Sate:"+ context.getState());

        GreenState greenState=new GreenState();
        greenState.doAction(context);

        System.out.println("Current State:"+ context.getState());

        RedState redState=new RedState();
        redState.doAction(context);
        System.out.println("Current State:"+ context.getState());
    }
}
