package com.demo.bridge;

public class Main {
    public static void main(String[] args) {
        WebFrameworkAbstraction obj=new SpringMVC(new HibernateFramework());
        obj.create("");
        obj.read(2);
        obj.delete(2);
        obj.update(2,"");
        obj.showDisplay();
    }
}
