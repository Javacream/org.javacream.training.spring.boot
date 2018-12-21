package org.javacream.training.order.impl;

import org.javacream.training.order.Helper;
import org.javacream.training.order.api.Order;
import org.javacream.training.order.api.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;

import java.util.Date;

public class SimpleOrderService implements OrderService {
    private String demoProperty;
    private Helper helper;

    @Override
    public Order order(String item, Integer number) {
        Order order = new Order(item, number, new Date());
        helper.handleOrderCreated(order);
        return order;
    }

    public void setDemoProperty(String demoProperty) {
        this.demoProperty = demoProperty;
    }

    public void setHelper(Helper helper) {
        this.helper = helper;
    }
}
