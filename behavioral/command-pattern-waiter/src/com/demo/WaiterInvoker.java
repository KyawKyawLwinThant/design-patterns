package com.demo;

import java.util.ArrayList;
import java.util.List;

public class WaiterInvoker {
    private List<IOrderCommand> orderList=new ArrayList<>();

    public void addOrder(IOrderCommand order){
        orderList.add(order);
    }
    public void cancelOrder(IOrderCommand order){
        orderList.remove(order);
    }
    public void executeOrder(IOrderCommand order){
        order.execute();
        orderList.remove(order);
    }

    public void executeBatchOfOrders(){
        for(IOrderCommand orderCommand:orderList){
            orderCommand.execute();
        }
        orderList.clear();
    }
}
