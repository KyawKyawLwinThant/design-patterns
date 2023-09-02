package com.demo;

public class Leaf extends Component{

    public Leaf(String name){
        super(name);
    }

    public void printTree(){
        System.out.println(" "+getName());
    }
}
