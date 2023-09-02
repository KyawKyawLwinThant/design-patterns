package com.demo;

public class Main {
    public static void main(String[] args) {
        Manager CEO=new Manager("John","CEO",30000);

        Manager headSales=new Manager("Robert","Head Sales",20000);
        Manager headMarketing=new Manager("Michel","Head Marketing",20000);

        IndividualContributor clerk1=new IndividualContributor("Laura","Marketing",10000);
        IndividualContributor clerk2=new IndividualContributor("Bob","Marketing",10000);

        IndividualContributor salesExecutive1=new IndividualContributor("Richard","Sales",10000);
        IndividualContributor salesExecutive2=new IndividualContributor("Rob","Sales",10000);

        CEO.add(headMarketing);
        CEO.add(headSales);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        CEO.getManagementTree();


    }
}
