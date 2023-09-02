package com.demo;

public class Main {
    public static void main(String[] args) {
        ISubject iSubject=new Proxy(new RealSubject());
        iSubject.doSomething1("Hello!","2");
        iSubject.doSomething2("Life is beautiful!");
    }
}
