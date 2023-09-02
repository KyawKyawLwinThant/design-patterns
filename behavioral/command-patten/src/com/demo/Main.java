package com.demo;

public class Main {
    public static void main(String[] args) {
        IReceiver receiverA=new ReceiverA();
        IReceiver receiverB=new ReceiverB();

        ConcreteCommandA commandA=new ConcreteCommandA(receiverA);
        ConcreteCommandB commandB=new ConcreteCommandB(receiverB);

        Invoker invoker=new Invoker();
        invoker.addCommand(commandA);
        invoker.addCommand(commandB);

        invoker.executeCommands();
    }
}
