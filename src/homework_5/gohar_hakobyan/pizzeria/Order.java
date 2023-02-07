package homework_5.gohar_hakobyan.pizzeria;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderNumber;
    private Customer customer;
    private List<Pizza> pizzas;
    private LocalTime orderTime;
    private PizzaType pizzaType;


    public Order(int orderNumber, Customer customer) {
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.pizzas = new ArrayList<>();
        this.orderTime = LocalTime.now();
    }


    public LocalTime getTime() {
        return LocalTime.now();
    }

    public void addPizza(String name, ArrayList<String> ingredients, int quantity, PizzaType pizzaType) {
        if (name == null) {
            System.out.println("Name can't be empty.");
            return;
        }
        if (name.length() < 4 || name.length() > 20) {
            name = "customer_name_" + pizzas.size();
        }
        Pizza pizza = new Pizza(name, ingredients, quantity, pizzaType);
        pizzas.add(pizza);
    }

    public void addIngredient(String pizzaName, String ingredient) {
        for (Pizza pizza : pizzas) {
            if (pizza.getName().equals(pizzaName)) {
                if (pizza.getIngredients().size() >= 7) {
                    System.out.println("This pizza already contains 7 ingredients!");
                } else if (pizza.getIngredients().contains(ingredient)) {
                    System.out.println("This ingredient is already added!");
                } else {
                    pizza.getIngredients().add(ingredient);
                }
            }
        }
    }

    public void printCheck() {
        double totalAmount = 1;
        System.out.println("********************************");
        System.out.println("Order: " + orderNumber);
        System.out.println("Client: " + customer.getCustomerPhone());
        for (Pizza pizza : pizzas) {
            System.out.println("Name: " + pizza.getName());
            System.out.println("--------------------------------");
            if (pizza.getPizzaType().equals(PizzaType.CLOSED)) {
                totalAmount += 0.5;
                System.out.println("Pizza Base (Calzone) " + totalAmount + " €");
            } else {
                System.out.println("Pizza Base (Regular) " + totalAmount + " €");
            }
            for (String ingredient : pizza.getIngredients()) {
                double price = switch (ingredient) {
                    case "Tomato paste" -> 1;
                    case "Cheese" -> 1;
                    case "Salami" -> 1.5;
                    case "Bacon" -> 1.2;
                    case "Garlic" -> 0.3;
                    case "Corn" -> 0.7;
                    case "Pepperoni" -> 0.6;
                    case "Olives" -> 0.5;
                    default -> 0;
                };
                System.out.println(ingredient + " " + price + " €");
                totalAmount += price;
            }
            System.out.println("--------------------------------");
            System.out.println("Amount: " + totalAmount + " €");
            System.out.println("Quantity: " + pizza.getQuantity());
            System.out.println("--------------------------------");
            totalAmount = totalAmount * pizza.getQuantity();
        }

        System.out.println("Total amount: " + totalAmount + " €");
        System.out.println("********************************");
    }
}

