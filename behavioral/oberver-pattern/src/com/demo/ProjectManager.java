package com.demo;

public class ProjectManager implements Observer{

    @Override
    public void update(Observable observable, String action, String record) {
        System.out.println(
                String.format("%s said to %s that %s action took place on %s.",
                        observable.getClass().getSimpleName(),
                        this.getClass().getSimpleName(),
                        action,
                        record)
        );
    }
}
