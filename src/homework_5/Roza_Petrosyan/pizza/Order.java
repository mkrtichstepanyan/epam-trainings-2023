package homework_5.Roza_Petrosyan.pizza;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Order {
    private final int ORDER_NUMBER = ((1 + new Random(System.currentTimeMillis()).nextInt(2)) * 10000
            + new Random(System.currentTimeMillis()).nextInt(10000));

    private final Customer customer;
    private final Pizza[] pizzas;
    private final LocalTime ORDER_TIME = LocalTime.parse(LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));

    public Order(Customer customer, Pizza[] pizzas) {
        this.customer = customer;
        this.pizzas = pizzas;
        if (getTotalQuantity(this.pizzas) > 10) {
            System.out.println("You can not order more than 10 pizza!");
        }
        checkPizzaName(this.pizzas);
    }

    public int getOrderNumber() {
        return ORDER_NUMBER;
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }

    public LocalTime getOrderTime() {
        return ORDER_TIME;
    }

    public Customer getCustomer() {
        return customer;
    }

    private int getTotalQuantity(Pizza[] pizzas) {
        int result = 0;
        for (Pizza pizza : pizzas) {
            result += pizza.getQuantity();
        }
        return result;
    }

    private void checkPizzaName(Pizza[] pizzas) {
        for (Pizza pizza : pizzas) {
            String pizzaName = pizza.getPizzaName();
            if (pizza.getPizzaName() != null
                    && pizza.getPizzaName().length() >= 4
                    && pizza.getPizzaName().length() <= 20
                    && pizza.getPizzaName().matches("\\p{IsLatin}+")) {
                pizza.setPizzaName(pizzaName);
            } else {
                pizza.setPizzaName(getCustomer().getCustomerName() + "_" + getOrderNumber());
            }
        }
    }

    public void displayPizzaAttributes(Pizza[] pizzas) {
        for (Pizza pizza : pizzas) {
            System.out.println("[" + ORDER_NUMBER +
                    ":" + getCustomer().getCustomerNumber() +
                    ":" + pizza.getPizzaName() +
                    ":" + pizza.getQuantity() + "]");
        }
    }
}
