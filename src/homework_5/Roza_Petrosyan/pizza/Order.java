package homework_5.Roza_Petrosyan.pizza;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Order {
    private final int ORDER_NUMBER = ((1 + new Random(System.currentTimeMillis()).nextInt(2)) * 10000
            + new Random(System.currentTimeMillis()).nextInt(10000));

    private Customer customer;
    private Pizza[] pizzas;
    private LocalTime order_time = LocalTime.parse(LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));

    public Order(Customer customer, Pizza[] pizzas) {
        this.customer = customer;
        this.pizzas = pizzas;
        if (pizzas.length > 10) {
            System.out.println("You can not order more than 10 pizza!");
        }
    }

    public int getOrder_number() {
        return ORDER_NUMBER;
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }

    public LocalTime getOrder_time() {
        return order_time;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void displayPizzaAttributes(int item) {
        System.out.println("[" + ORDER_NUMBER +
                ":" + getCustomer().getCustomerNumber() +
                ":" + getPizzas()[item].getPizzaName() +
                ":" + getPizzas()[item].getQuantity() + "]");
    }

    public void checkPizzaName(Pizza pizza) {
        String pizzaName = pizza.getPizzaName();
        if (pizza.getPizzaName().length() >= 4 && pizza.getPizzaName().length() <= 20 && pizza.getPizzaName().matches("\\p{IsLatin}+")) {
            pizza.setPizzaName(pizzaName);
        } else {
            pizza.setPizzaName(getCustomer().getCustomerName() + "_" + getOrder_number());
        }
    }
}
