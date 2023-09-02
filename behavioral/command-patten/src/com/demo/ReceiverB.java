package com.demo;

public class ReceiverB implements IReceiver{
    @Override
    public void operationA() {
        System.out.println("OperationA of ReceiverB invoked.");
    }

    @Override
    public void operationB() {
        System.out.println("OperationB of ReceiverB invoked.");
    }
}
