package com.demo;

public interface Observer {
    public void update(Observable observable,String action,String record);
}
