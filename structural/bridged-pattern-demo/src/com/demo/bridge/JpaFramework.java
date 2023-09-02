package com.demo.bridge;

public class JpaFramework implements IPersistance{
    @Override
    public void create(Object obj) {
        System.out.println("JPA create");
    }

    @Override
    public Object read(int id) {
        System.out.println("JPA read");
        return null;
    }

    @Override
    public void update(int id, Object object) {
        System.out.println("JPA Update.");
    }

    @Override
    public void delete(int id) {
        System.out.println("JPA delete.");
    }
}
