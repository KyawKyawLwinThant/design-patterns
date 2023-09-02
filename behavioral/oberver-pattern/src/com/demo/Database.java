package com.demo;

import java.util.ArrayList;
import java.util.List;

public class Database implements Observable{
    private List<Observer> list=new ArrayList<>();
    private String action;
    private String record;

    public Database(String action, String record) {
        this.action = action;
        this.record = record;
    }

    @Override
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver() {
        notifyToAll();
    }

    private void notifyToAll() {
        for(Observer observer:list){
            observer.update(this,action,record);
        }
    }
}
