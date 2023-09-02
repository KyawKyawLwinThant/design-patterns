package com.demo;

import java.util.HashMap;
import java.util.Map;

public class ChatRoom implements IChatRoom{

    private Map<Integer,Channel> channels=new HashMap<>();
    private static int channelNumber = 0;
    @Override
    public void postMessageToAll(Chatter chatter, String message) {
        System.out.println(chatter.getName() + " posted " + message + " to all.");
    }

    @Override
    public void sendMessageToChannel(int channelNumber, String message) {
        Channel channel=channels.get(channelNumber);
        System.out.println(channel.getChatter1().getName() +
                " exchanged "+ message + " with "+ channel.getChatter2().getName());
    }

    @Override
    public int createChannel(Chatter chatter1, Chatter chatter2) {
        channels.put(++channelNumber,new Channel(chatter1,chatter2));
        return channelNumber;
    }
}
