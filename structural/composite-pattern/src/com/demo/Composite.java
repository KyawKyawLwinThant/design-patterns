package com.demo;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
    private List<Component> childComponents=new ArrayList<>();

    public Composite(String name){
        super(name);
    }
    public void add(Component component){
        childComponents.add(component);
    }
    public void remove(Component component){
        childComponents.remove(component);
    }
    @Override
    public void printTree() {
        System.out.println(getName());
        for(Component component:childComponents){
            component.printTree();
        }
    }
}
