package homework_5.Roza_Petrosyan.pizza;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Order {
    private final int ORDER_NUMBER = ((1 + new Random(System.currentTimeMillis()).nextInt(2)) * 10000
            + new Random(System.currentTimeMillis()).nextInt(10000));

    private Customer customer;
    private Pizza[] pizza = new Pizza[10];
    private LocalTime order_time = LocalTime.parse(LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));

    public Order(Customer customer) {
        this.customer = customer;
        if (pizza.length > 10) {
            System.out.println("You can not order more than 10 pizza!");
        }
    }

    public int getOrder_number() {
        return ORDER_NUMBER;
    }

    public Pizza[] getPizza() {
        return pizza;
    }

    public LocalTime getOrder_time() {
        return order_time;
    }

    public Customer getCustomer() {
        return customer;
    }
}
