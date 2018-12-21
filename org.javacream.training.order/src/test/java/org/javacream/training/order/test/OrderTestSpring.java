package org.javacream.training.order.test;

import org.javacream.training.order.api.Order;
import org.javacream.training.order.api.OrderService;
import org.javacream.training.order.impl.SimpleOrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderTestSpring {
    @Autowired private SimpleOrderService orderService;
    @Test
    public void testOrder(){
        System.out.println(orderService.getClass().getName());
        orderService.order("ISBN1", 10);
    }

}
