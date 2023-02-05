package homework_5.Araksya_Ghazaryan.Palmetto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderNumber;
    private Customer customer;
    private List<Pizza> pizzas;

    public Order(Customer customer) {
        this.orderNumber = (int) (orderNumber + Math.random() * 100000);
        this.customer = customer;
        this.pizzas = new ArrayList<>();
    }

    public void addPizza(Pizza pizza) {
        this.pizzas.add(pizza);
    }
    public void printCheck() {
        System.out.println( "***************");
        System.out.println( "Order: " + this.orderNumber);
        System.out.println( "Customer: " + this.customer.getNumber());
        System.out.println( "Order time: " + LocalDateTime.now());
        for (Pizza pizza : this.pizzas) {
            System.out.println( "Name: " + pizza.getName());
            System.out.println( "--------------");

            double pizzaAmount = 1.0;
            if (pizza.getType().equals(PizzaType.closed)) {
                pizzaAmount += 0.5;
                System.out.println( "Pizza Base (Calzone) " + pizzaAmount + " €");
            } else {
                System.out.println( "Pizza Base (Regular) " + pizzaAmount + " €");
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
                pizzaAmount += ingredientPrice;
                System.out.println(ingredient + " " + ingredientPrice + " €");
            }
            System.out.println("-----------------");
            System.out.println( "Amount: " + pizzaAmount + " €");
            System.out.println( "Quantity: " + pizza.getQuantity());
        }
        System.out.println( "*****************");
    }
    public void PizzaAttributes() {
        for (Pizza pizza : this.pizzas) {
            System.out.println( "[Order: " + this.orderNumber + " : " + this.customer.getNumber() + " : " +
                    pizza.getName() + " : " + pizza.getQuantity() + "]");
        }
    }
}