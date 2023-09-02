package com.demo;

public class Channel {

    private Chatter chatter1;
    private Chatter chatter2;

    public Channel(Chatter chatter1, Chatter chatter2) {
        this.chatter1 = chatter1;
        this.chatter2 = chatter2;
    }

    public Chatter getChatter1() {
        return chatter1;
    }

    public void setChatter1(Chatter chatter1) {
        this.chatter1 = chatter1;
    }

    public Chatter getChatter2() {
        return chatter2;
    }

    public void setChatter2(Chatter chatter2) {
        this.chatter2 = chatter2;
    }
}
