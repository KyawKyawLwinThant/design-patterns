package com.demo;

public class Main {
    public static void main(String[] args) {
        Leaf leaf1=new Leaf("leaf1");
        Leaf leaf2=new Leaf("leaf2");
        Leaf leaf3=new Leaf("leaf3");
        Leaf leaf4=new Leaf("leaf4");

        Composite composite1=new Composite("Composite1");
        Composite composite2=new Composite("Composite2");
        Composite composite3=new Composite("Composite3");

        composite2.add(leaf1);
        composite2.add(leaf2);
        composite2.add(leaf3);

        composite3.add(leaf4);

        composite1.add(composite2);
        composite1.add(composite3);

        composite1.printTree();

    }
}
