package com.demo.singleton;

public class Employee {

    private static Employee employee;

    private Employee(){

    }

    public static Employee getEmployeeInstance(){
        if(employee == null){
            employee = new Employee();
        }
        return employee;
    }
}
