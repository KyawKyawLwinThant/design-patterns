package com.demo;

public class Main {
    public static void main(String[] args) {
        Boss boss=new Boss();
        Customer customer=new Customer();
        ProjectManager projectManager=new ProjectManager();

        Database database=new Database("Delete","record 1");

        database.addObserver(boss);
        database.addObserver(customer);
        database.addObserver(projectManager);

        database.removeObserver(customer);
        database.notifyObserver();
    }
}
