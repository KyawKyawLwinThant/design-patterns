package com.demo;

public class IndividualContributor extends Employee{
    public IndividualContributor(String name,String dept,int sal){
        super(name,dept,sal);
    }
    @Override
    public void getManagementTree() {
        System.out.println(" "+ getName() + " "+ getDept());
    }
}
