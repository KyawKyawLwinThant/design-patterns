package com.demo;

public class ConcreteCommandB implements ICommand{
    private IReceiver iReceiver;

    public ConcreteCommandB(IReceiver iReceiver) {
        this.iReceiver = iReceiver;
    }

    @Override
    public void execute() {
         iReceiver.operationB();
    }
}
