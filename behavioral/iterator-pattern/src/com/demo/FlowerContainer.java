package com.demo;

import java.util.ArrayList;
import java.util.List;

public class FlowerContainer implements IContainer{
    private List<String> flowerList=new ArrayList<>();

    public FlowerContainer(){
        flowerList.add("rose");
        flowerList.add("daffodil");
    }


    @Override
    public IIterator createIterator() {
        return new FlowerIterator();
    }

    private class FlowerIterator implements IIterator{

        @Override
        public boolean hasNext() {
            if(flowerList.size() > 0){
                return true;
            }else{
                return false;
            }
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                String flower= flowerList.get(0);
                flowerList.remove(0);
                return flower;
            }
            else {
                return null;
            }
        }
    }
}
