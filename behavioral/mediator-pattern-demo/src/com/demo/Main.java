package com.demo;

public class Main {
    public static void main(String[] args) {
        IChatRoom iChatRoom=new ChatRoom();

        Chatter john=new Chatter("John",iChatRoom);
        Chatter mary=new Chatter("Mary",iChatRoom);
        Chatter david=new Chatter("David",iChatRoom);

        john.postMessage("Good Morning!");
        mary.postMessage("Good Afternoon!");
        david.postMessage("Good Evening!");

        int channel=iChatRoom.createChannel(john,mary);
        john.sendMessage(channel,"Life is beautiful!");
        channel=iChatRoom.createChannel(john,david);
        john.sendMessage(channel,"Life is good!");

    }
}
