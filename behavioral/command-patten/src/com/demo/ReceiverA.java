package com.demo;

public class ReceiverA implements IReceiver{
    @Override
    public void operationA() {
        System.out.println("OperationA of ReceiverA invoked.");
    }

    @Override
    public void operationB() {
        System.out.println("OperationB of ReceiverA invoked.");
    }
}
