package homework_5.Roza_Petrosyan.pizza;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Order {
    private final int ORDER_NUMBER = ((1 + new Random(System.currentTimeMillis()).nextInt(9)) * 10000
            + new Random(System.currentTimeMillis()).nextInt(10000));

    private final Customer customer;
    private Pizza[] pizzas;
    private final LocalTime ORDER_TIME = LocalTime.parse(LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));

    public Order(Customer customer, Pizza[] pizzas) {
        this.customer = customer;
        checkPizzaQuantity(pizzas);
        checkPizzaName(pizzas);
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
        if(pizzas != null) {
            for (Pizza pizza : pizzas) {
                result += pizza.getQuantity();
            }
        }
        return result;
    }

    private void checkPizzaQuantity(Pizza[] pizzas){
        if (getTotalQuantity(pizzas) > 10) {
            this.pizzas = null;
            System.out.println("You can not order more than 10 pizza!");
        } else {
            this.pizzas = pizzas;
        }
    }
    private void checkPizzaName(Pizza[] pizzas) {
        if(pizzas != null) {
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
    }

    public void displayPizzaAttributes(Pizza[] pizzas) {
        if(this.pizzas != null){
            for (Pizza pizza : pizzas) {
                System.out.println("[" + ORDER_NUMBER +
                        ":" + getCustomer().getCustomerNumber() +
                        ":" + pizza.getPizzaName() +
                        ":" + pizza.getQuantity() + "]");
            }
        }
    }
}
