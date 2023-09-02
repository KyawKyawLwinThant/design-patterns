package com.demo.bridge;

public class MyBaitsFramework implements IPersistance{
    @Override
    public void create(Object obj) {
        System.out.println("MyBatis create.");
    }

    @Override
    public Object read(int id) {
        System.out.println("MyBatis read.");
        return null;
    }

    @Override
    public void update(int id, Object object) {
        System.out.println("MyBatis update.");
    }

    @Override
    public void delete(int id) {
        System.out.println("MyBatis delete.");
    }
}
