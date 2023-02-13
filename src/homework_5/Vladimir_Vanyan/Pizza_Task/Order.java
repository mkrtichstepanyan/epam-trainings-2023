package homework_5.Vladimir_Vanyan.Pizza_Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order {
    private int orderNumber;
    private Customer customer;
    private List<Pizza> pizzaList;
    Random r = new Random();
    private int low = 10000;
    private int high = 99999;

    public Order(Customer customer) {
        orderNumber = r.nextInt(high - low) + low;
        this.customer = customer;
        this.pizzaList = new ArrayList<>();
    }

    public void addPizza(Pizza pizza) {

        this.pizzaList.add(pizza);
    }

    public void displayPizzaAttributes(Pizza pizza) {
        if (pizza != null) {
            System.out.println("[Order: " + this.orderNumber + " : " + this.customer.getNumber()
                    + " : " + pizza.getName() + " : " + pizza.getQuantity() + "]");
        }
    }

    public void printCheck() {
        System.out.println("********************************");
        System.out.println("Order: " + this.orderNumber);
        System.out.println("Client: " + this.customer.getNumber());
        double totalAmount = 0.0;
        totalAmount = getTotalAmount(totalAmount);
        System.out.println("Total amount: " + totalAmount + " $");
    }

    private double getTotalAmount(double totalAmount) {
        for (Pizza pizza : this.pizzaList) {
            if (pizza == null) {
                continue;
            }
            System.out.println("Name: " + pizza.getName());
            System.out.println("--------------------------------");
            double basePrice = 1;
            if (pizza.getType().equals("Calzone")) {
                basePrice += 0.5;
            }
            System.out.println("Pizza Base (" + pizza.getType() + ") " + basePrice + " $");
            System.out.println("--------------------------------");
            System.out.println("Amount: " + basePrice + " $");
            System.out.println("Client: " + this.customer.getNumber());
            System.out.println("Quantity: " + pizza.getQuantity());
            System.out.println("--------------------------------");
            totalAmount += basePrice * pizza.getQuantity();
        }
        return totalAmount;
    }
}

