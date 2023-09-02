package com.demo.flyweight;

public class Main {
    private static final String colors[]= {"Red","Green","Blue"};
    public static void main(String[] args) {
        for(int i=0;i<20;i++){
            Circle circle=(Circle) ShapeFactory.getCircle(getRandomColor());
            circle.draw(getRandomX(),getRandomY(),getRandomRadius());
        }
    }
    private static int getRandomX(){
        return (int)(Math.random() * 100);
    }

    private static int getRandomY(){
        return (int)(Math.random() * 100);
    }
    private static int getRandomRadius(){
        return (int)(Math.random() * 50);
    }


    private static String getRandomColor(){
        return colors[(int) (Math.random() * colors.length)];
    }
}
