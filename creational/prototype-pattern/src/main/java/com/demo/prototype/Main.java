package com.demo.prototype;

public class Main {
    public static void main(String[] args) {
        Student student=new Student("John","Doe","Latha","john@gmail.com");

        Student studentClone=(Student) student.clone();
        System.out.println(studentClone);
        studentClone.setEmail("johndoe.gamil.com");
        //Student studentClone2=(Student) studentClone.clone();

        System.out.println(studentClone);
    }
}
