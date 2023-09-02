package com.demo;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{
    private List<Employee> subordinates;

    public Manager(String name,String dep,int sal){
        super(name,dep,sal);
        subordinates=new ArrayList<>();
    }

    public void add(Employee e){
        subordinates.add(e);
    }

    public void remove(Employee e){
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }

    public void getManagementTree(){
        System.out.println(getName() + " "+ getDept());
        for(Employee employee:getSubordinates()){
            employee.getManagementTree();
        }
    }

}
