package com.demo.bridge;

import com.sun.security.jgss.GSSUtil;

public class RubyRails extends WebFrameworkAbstraction{
    public RubyRails(IPersistance iPersistance) {
        super(iPersistance);
    }

    @Override
    public void create(Object obj) {
        iPersistance.create(obj);
    }

    @Override
    public Object read(int id) {
        iPersistance.read(id);
        return null;
    }

    @Override
    public void update(int id, Object object) {
        iPersistance.update(id,object);
    }

    @Override
    public void delete(int id) {
        iPersistance.delete(id);
    }

    @Override
    public void showDisplay() {
        System.out.println("Ruby Rails.");
    }
}
