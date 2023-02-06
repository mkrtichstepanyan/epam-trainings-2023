package homework_5.Karen_Mikayelyan;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderNumber;
    private final Customer customer;
    private final List<Pizza> pizzas;

    private final LocalDateTime orderTime;

    public Order(Customer customer) {
        this.orderNumber = (int) (orderNumber + Math.random() * 10000);
        this.customer = customer;
        this.pizzas = new ArrayList<>();
        this.orderTime = LocalDateTime.now();
    }

    public void addPizza(Pizza pizza) {
        this.pizzas.add(pizza);
    }

    public void displayPizzaAttributes(Pizza pizza) {
        if (pizza != null) {
            System.out.println("--------------------------------");
            System.out.println("[Order: " + this.orderNumber + " : " + this.customer.getNumber()
                    + " : " + pizza.getName() + " : " + pizza.getQuantity() + "]");
        }
    }

    public void printCheck() {
        System.out.println("********************************");
        System.out.println("Order: " + this.orderNumber);
        System.out.println("Client: " + this.customer.getNumber());
        System.out.println("Order date and time: " + orderTime);
        double totalAmount = 0.0;
        totalAmount = getTotalAmount(totalAmount);
        System.out.println("Total amount: " + totalAmount + " $");
    }

    private double getBasePrice(Pizza pizza, double basePrice) {
        for (String ingredient : pizza.getIngredients()) {
            double ingredientPrice = switch (ingredient) {
                case "Tomato paste" -> 1.0;
                case "Cheese" -> 1.0;
                case "Salami" -> 1.5;
                case "Bacon" -> 1.2;
                case "Garlic" -> 0.3;
                case "Corn" -> 0.7;
                case "Pepperoni" -> 0.6;
                case "Olives" -> 0.5;
                default -> 0.0;
            };
            basePrice += ingredientPrice;
            System.out.println(ingredient + " " + ingredientPrice + " $");
        }
        return basePrice;
    }

    private double getTotalAmount(double totalAmount) {
        for (Pizza pizza : this.pizzas) {
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
            basePrice = getBasePrice(pizza, basePrice);
            System.out.println("--------------------------------");
            System.out.println("Amount: " + basePrice + " $");
            System.out.println("Quantity: " + pizza.getQuantity());
            System.out.println("--------------------------------");
            totalAmount += basePrice * pizza.getQuantity();
        }
        return totalAmount;
    }

}
