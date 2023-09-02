package com.demo;

public class Chatter {
    private String name;
    private IChatRoom chatRoom;

    public Chatter(String name,IChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public void postMessage(String message){
        chatRoom.postMessageToAll(this,message);
    }
    public void sendMessage(int channel,String message){
        chatRoom.sendMessageToChannel(channel,message);
    }
    public String getName(){
        return name;
    }
}
