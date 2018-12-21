package org.javacream.training.order;

import org.javacream.training.order.api.Order;

public class Helper {
    public void handleOrderCreated(Order o){
        System.out.println("Created an order: " + o);
    }
}
