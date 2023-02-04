package homework_5.Robert_Nazaryan.pizza;

import java.time.LocalTime;
import java.util.Random;

public class Order {

    private Pizza[] pizzas;
    private Customer customer;
    private final int orderNumber;
    private LocalTime orderTime;
    private int index;

    public Order(Customer customer, Pizza[] pizzas, String type) {
        this.orderNumber = new Random().nextInt(99999 - 10000) + 10000;
        this.orderTime = LocalTime.now();
        this.customer = customer;
        if (pizzas.length <= 10) {
            this.pizzas = pizzas;
        }
        this.index = pizzas.length - 1;
        pizzas[index].setPizzaType(type);
    }

    public void orderInfo() {
        System.out.println("[ " + orderNumber + " | " + customer.getNumber() + " | " + customer.getName() + " | " + pizzas.length + " | " + orderTime + " ]");
    }

    public void printCheck() {
        System.out.println("****************************************");
        System.out.println("Order: " + this.orderNumber);
        System.out.println("Client: " + customer.getNumber());
        System.out.println("Name: " + customer.getName());
        System.out.println("----------------------------------------");
        System.out.println("Pizza Base: " + pizzas[index].getPizzaType());
        pizzas[index].getIngredients();
        System.out.println("----------------------------------------");
        System.out.println("Amount: " + pizzas[index].getPrice() + " $");
        System.out.println("Quantity: " + pizzas.length);
        System.out.println("----------------------------------------");
        System.out.println("Total amount: " + pizzas[index].getPrice() * (index+1) + " $");
    }
}
