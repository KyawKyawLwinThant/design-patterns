package com.demo;

public class ConcreteCommandA implements ICommand{
    private IReceiver iReceiver;

    public ConcreteCommandA(IReceiver iReceiver) {
        this.iReceiver = iReceiver;
    }

    @Override
    public void execute() {
        iReceiver.operationA();
    }
}
