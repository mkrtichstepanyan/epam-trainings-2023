package homework_5.pizza;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Order {
    private int orderNumber;
    private Customer customer;
    private OrderItem[] orderItems;
    private int orderItemCount;
    private final LocalTime time = LocalTime.now();

    public LocalTime getTime() {
        return time;
    }

    public Order() {
        this.orderNumber = (int) (10000 + (Math.random() * 1000));
        this.customer = customer;
        this.orderItems = orderItems;
    }


    public int getOrderNumber() {
        return this.orderNumber;
    }

    public OrderItem[] addOrderItems() {
        this.orderItems = new OrderItem[orderItemCount++];
        return this.orderItems;
    }

    public OrderItem[] getOrderItems() {
        return orderItems;
    }

}
