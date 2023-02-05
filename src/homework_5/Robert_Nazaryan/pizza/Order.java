package homework_5.Robert_Nazaryan.pizza;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Order {

    private Pizza[] pizzas;
    private Customer customer;
    private final int orderNumber;
    private LocalDateTime orderTime;
    private double totalPrice;

    public Order(Customer customer, Pizza[] pizzas, String type) {
        this.orderNumber = new Random().nextInt(99999 - 10000) + 10000;
        this.orderTime = LocalDateTime.now();
        this.customer = customer;
        if (pizzas.length <= 10) {
            this.pizzas = pizzas;
        } else {
            System.out.println("You can't order more than 10 pizzas!");
        }
        for (int i = 0; i < pizzas.length; i++) {
            pizzas[i].setPizzaType(type);
        }
    }

    public void orderInfo() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDate = dtf.format(orderTime);
        System.out.println("[ " + orderNumber + " | " + customer.getNumber() + " | " + customer.getName() + " | " + pizzas.length + " | " + formatDate + " ]");
    }

    public void printCheck() {
        System.out.println("****************************************");
        System.out.println("Order: " + this.orderNumber);
        System.out.println("Client: " + customer.getNumber());
        System.out.println("Name: " + customer.getName());
        System.out.println("----------------------------------------");
        for (int i = 0; i < pizzas.length; i++) {
            System.out.println("Pizza Base: " + pizzas[i].getPizzaType());
            pizzas[i].getIngredients();
            System.out.println("----------------------------------------");
            System.out.println("Amount: " + pizzas[i].getPrice() + " $");
            System.out.println("Quantity: " + pizzas.length);
            System.out.println("----------------------------------------");
            totalPrice += pizzas[i].getPrice();
        }
        System.out.println("Total amount: " + totalPrice * pizzas.length + " $");
    }
}
