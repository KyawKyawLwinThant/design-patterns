package com.demo;

public class Main {
    public static void main(String[] args) {
        IOrderCommand commandA=new FoodCommand(new FoodPreparerReceiver("Mary"),"hamburger");
        IOrderCommand commandB=new FoodCommand(new FoodPreparerReceiver("Mary"),"french fries");
        IOrderCommand commandC=new DrinkCommand(new DrinkPreparerReceiver("John"),"magarita");

        WaiterInvoker waiterInvoker=new WaiterInvoker();
        waiterInvoker.addOrder(commandA);
        waiterInvoker.addOrder(commandB);
        waiterInvoker.addOrder(commandC);
        waiterInvoker.cancelOrder(commandC);


        waiterInvoker.executeBatchOfOrders();
    }
}
