package org.javacream.training.order.test;

import org.javacream.training.order.api.Order;
import org.javacream.training.order.impl.SimpleOrderService;
import org.junit.Test;

public class OrderTestNoSpring {

    @Test
    public void testOrder(){
        SimpleOrderService orderService = new SimpleOrderService();
        Order order = orderService.order("ISBN1", 10);
        System.out.println(order);
    }

}
