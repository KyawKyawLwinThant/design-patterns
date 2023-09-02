package com.demo.singleton;

public class Main {
    public static void main(String[] args) {

       Employee e1=Employee.getEmployeeInstance();
       Employee e2=Employee.getEmployeeInstance();
       Employee e3=Employee.getEmployeeInstance();


        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        boolean test= e1 == e3;

        System.out.println("e1 and e3 refers to the same obj:"+ test);
    }
}
