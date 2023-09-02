package com.demo;

public class FoodPreparerReceiver {
    private String personName;


    public FoodPreparerReceiver(String personName) {
        this.personName = personName;

    }

    public void prepareFood(String foodName){
        System.out.println(personName + " prepares "+ foodName);
    }
}
