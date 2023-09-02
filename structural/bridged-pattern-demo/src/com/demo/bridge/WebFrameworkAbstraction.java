package com.demo.bridge;
//bridged
public abstract class WebFrameworkAbstraction {

    protected IPersistance iPersistance;

    public WebFrameworkAbstraction(IPersistance iPersistance) {
        this.iPersistance = iPersistance;
    }
    //for IPersistence
    public abstract void create(Object obj);
    public abstract Object read(int id);

    public abstract void update(int id,Object object);

    public abstract void delete(int id);

    //for WebFramework
    public abstract void showDisplay();


}
