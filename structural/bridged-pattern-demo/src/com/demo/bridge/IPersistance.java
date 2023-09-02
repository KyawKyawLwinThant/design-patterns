package com.demo.bridge;

public interface IPersistance {

    void create(Object obj);
    Object read(int id);

    void update(int id,Object object);

    void delete(int id);

   // void test();
}
