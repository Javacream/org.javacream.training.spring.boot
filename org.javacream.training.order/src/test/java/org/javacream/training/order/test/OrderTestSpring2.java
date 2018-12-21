package org.javacream.training.order.test;

import org.javacream.training.order.api.Order;
import org.javacream.training.order.api.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:/order-beans.xml")
public class OrderTestSpring2 {
    @Autowired private OrderService orderService;
    @Test
    public void testOrder(){
        Order order = orderService.order("ISBN1", 10);
        System.out.println(order);
    }

}
