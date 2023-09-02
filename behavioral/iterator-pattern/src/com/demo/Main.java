package com.demo;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------->Get flowers through Iterator.");
        IContainer iContainer=new FlowerContainer();
        IIterator iIterator=iContainer.createIterator();
        while(iIterator.hasNext()){
            Object object=iIterator.next();
            System.out.println(object);
        }
    }
}
