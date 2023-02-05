package homework_5.Nona_Asatryan.pizzeria_palmetto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private final int orderNumber;
    private static int nextOrderNumber = 10001;
    private final Customer customer;
    private final List<Pizza> pizzas;
    private final LocalDateTime orderTime;
    private static final int MAX_QUANTITY_OF_PIZZAS = 10;


    public Order(Customer customer) {
        this.orderNumber = nextOrderNumber++;
        this.customer = customer;
        this.pizzas = new ArrayList<>();
        this.orderTime = LocalDateTime.now();
    }

    public void addPizza(Pizza pizza) {
        if (pizza.getQuantity() >= MAX_QUANTITY_OF_PIZZAS) {
            System.out.println("Sorry, you can't order more than 10 pizzas.");
            System.exit(1);
        }
        pizzas.add(pizza);
    }

    public void printCheck() {
        System.out.println("********************************");
        System.out.println("Order: " + orderNumber);
        System.out.println("Client: " + customer.getNumber());
        System.out.println("Order time: " + orderTime);
        double totalAmount = 0.0;
        for (Pizza pizza : pizzas) {
            System.out.println("Name: " + pizza.getName());
            System.out.println("--------------------------------");

            double pizzaAmount = 1.0;
            if (pizza.getType().equals(PizzaType.CLOSED)) {
                System.out.println("Pizza Base (Calzone) " + pizzaAmount + " €");
            } else {
                System.out.println("Pizza Base (Regular) " + pizzaAmount + " €");
            }

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
                System.out.println(ingredient + " " + ingredientPrice + " €");
                pizzaAmount += ingredientPrice;
            }

            System.out.println("--------------------------------");
            System.out.println("Amount: " + pizzaAmount + " €");
            System.out.println("Quantity: " + pizza.getQuantity());
            System.out.println("--------------------------------");

            totalAmount += pizzaAmount * pizza.getQuantity();
        }

        System.out.println("Total amount: " + totalAmount + " €");
        System.out.println("********************************");
    }


    public void displayPizzaAttributes(Pizza pizza) {
        if (pizza != null) {
            System.out.println("_____________________________________");
            System.out.println("[Order: " + orderNumber + " : " + customer.getNumber() + " : " +
                    pizza.getName() + " : " + pizza.getQuantity() + "]");
        }
    }
}

