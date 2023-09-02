package com.demo.bridge;

public class HibernateFramework implements IPersistance{
    @Override
    public void create(Object obj) {
        System.out.println("Hibernate create.");
    }

    @Override
    public Object read(int id) {
        System.out.println("Hibernate read.");
        return null;
    }

    @Override
    public void update(int id, Object object) {
        System.out.println("Hibernate update.");
    }

    @Override
    public void delete(int id) {
        System.out.println("Hibernate delete.");
    }
}
