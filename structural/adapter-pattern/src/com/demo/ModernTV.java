package com.demo;

public class ModernTV implements IRemoteControl{
    private OldTV oldTV;

    public ModernTV(OldTV oldTV) {
        this.oldTV = oldTV;
    }

    @Override
    public void on() {
        oldTV.turnKnobToRight();
    }

    @Override
    public void off() {
        oldTV.turnKnobToLeft();
    }
}
