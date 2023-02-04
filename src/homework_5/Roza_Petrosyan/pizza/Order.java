package homework_5.Roza_Petrosyan.pizza;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private String order_number;
    public Customer customer;
    public List<Pizza> pizza = new ArrayList<>(10);
    public LocalTime order_time = LocalTime.parse(LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));

    public Order(Customer customer, String order_number) {
        this.customer = customer;
        this.order_number = order_number;
    }


    public String getOrder_number() {
        return order_number;
    }

    public void checkOrderNumber(String order_number) {
        if (!order_number.matches("^[0-9]{5}$")) {
            System.out.println("Order number must be 5 digit");
        }
    }

}
