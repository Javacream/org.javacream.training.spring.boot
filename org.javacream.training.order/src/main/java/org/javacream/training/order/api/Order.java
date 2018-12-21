package org.javacream.training.order.api;

import java.util.Date;

public class Order {
    private String item;
    private Integer number;
    private Date orderDate;

    public Order(String item, Integer number, Date orderDate) {
        this.item = item;
        this.number = number;
        this.orderDate = orderDate;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "item='" + item + '\'' +
                ", number=" + number +
                ", orderDate=" + orderDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (item != null ? !item.equals(order.item) : order.item != null) return false;
        if (number != null ? !number.equals(order.number) : order.number != null) return false;
        return orderDate != null ? orderDate.equals(order.orderDate) : order.orderDate == null;
    }

    @Override
    public int hashCode() {
        int result = item != null ? item.hashCode() : 0;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (orderDate != null ? orderDate.hashCode() : 0);
        return result;
    }
}
