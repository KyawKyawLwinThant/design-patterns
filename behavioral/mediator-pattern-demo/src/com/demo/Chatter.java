package com.demo;

public class Chatter {

    private String name;
    private IChatRoom chatRoom;

    public Chatter(String name) {
        this.name = name;
    }

    public Chatter(String name, IChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public String getName() {
        return name;
    }

    public void postMessage(String message){
        chatRoom.postMessageToAll(this,message);
    }

    public void sendMessage(int channel,String message){
        chatRoom.setMessageToChannel(channel,message);
    }
}
