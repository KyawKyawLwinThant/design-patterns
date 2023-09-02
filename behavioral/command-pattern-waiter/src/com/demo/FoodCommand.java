package com.demo;

public class FoodCommand implements IOrderCommand{

    private FoodPreparerReceiver foodPreparerReceiver;
    private String foodName;

    public FoodCommand(FoodPreparerReceiver foodPreparerReceiver,String foodName) {
        this.foodPreparerReceiver = foodPreparerReceiver;
        this.foodName=foodName;

    }

    @Override
    public void execute() {
        foodPreparerReceiver.prepareFood(foodName);
    }
}
