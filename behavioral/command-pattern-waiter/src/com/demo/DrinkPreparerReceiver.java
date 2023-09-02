package com.demo;

public class DrinkPreparerReceiver {
    private String personName;

    public DrinkPreparerReceiver(String personName) {
        this.personName = personName;
    }

    public void prepareDrink(String drinkName){
        System.out.println(personName + " prepares "+ drinkName);
    }
}
