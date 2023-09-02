package com.demo.flyweight;

public class Circle  implements IShape{
    private String color;

    public Circle(String color){
        this.color = color;
    }

    @Override
    public void draw(int x, int y, int radius) {
        System.out.println("Circle: Draw() [Color :"+ color + ",x:"+ x +",y:"+ y + ",radius:"+ radius);
    }
}
