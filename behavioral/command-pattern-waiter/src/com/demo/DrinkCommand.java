package com.demo;

public class DrinkCommand implements IOrderCommand{

    private DrinkPreparerReceiver drinkPreparerReceiver;
    private String drinkName;

    public DrinkCommand(DrinkPreparerReceiver drinkPreparerReceiver, String drinkName) {
        this.drinkPreparerReceiver = drinkPreparerReceiver;
        this.drinkName = drinkName;
    }

    @Override
    public void execute() {
        drinkPreparerReceiver.prepareDrink(drinkName);
    }
}
