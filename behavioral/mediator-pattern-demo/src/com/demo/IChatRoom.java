package com.demo;

public interface IChatRoom {

    void postMessageToAll(Chatter chatter,String message);
    void setMessageToChannel(int channel,String message);

    int createChannel(Chatter chatter1,Chatter chatter2);
}
