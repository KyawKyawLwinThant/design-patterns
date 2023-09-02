package com.demo;

public class Main {
    public static void main(String[] args) {
        IRemoteControl tv=new ModernTV(new OldTV());
        tv.on();
        tv.off();
    }
}
