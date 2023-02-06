package homework_5.gohar_hakobyan.pizzeria;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderNumber;
    private Customer customer;
    private List<Pizza> pizzas;
    private LocalTime orderTime;

    public Order(int orderNumber, Customer customer) {
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.pizzas = new ArrayList<>();
        this.orderTime = LocalTime.now();
    }


    public LocalTime getTime() {
        return LocalTime.now();
    }

    public void addPizza(String name, ArrayList<String> ingredients, boolean isCalzone, int quantity) {
        if (name.length() < 4 || name.length() > 20) {
            name = "customer_name_" + pizzas.size();
        }
        Pizza pizza = new Pizza(name, ingredients, isCalzone, quantity);
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
        double totalAmount = 0;
        System.out.println("********************************");
        System.out.println("Order: " + orderNumber);
        System.out.println("Client: " + customer.getCustomerPhone());
        for (Pizza pizza : pizzas) {
            System.out.println("Name: " + pizza.getName());
            System.out.println("--------------------------------");
            System.out.println("Pizza Base (Calzone) " + (pizza.isCalzone() ? "1.50 €" : "1.00 €"));
            for (String ingredient : pizza.getIngredients()) {
                double price = 0;
                switch (ingredient) {
                    case "Tomato paste":
                        price = 1;
                        break;
                    case "Cheese":
                        price = 1;
                        break;
                    case "Salami":
                        price = 1.5;
                        break;
                    case "Bacon":
                        price = 1.2;
                        break;
                    case "Garlic":
                        price = 0.3;
                        break;
                    case "Corn":
                        price = 0.7;
                        break;
                    case "Pepperoni":
                        price = 0.6;
                        break;
                    case "Olives":
                        price = 0.5;
                        break;
                }
                System.out.println(ingredient + " " + price + " €");
                totalAmount += price;
            }
            System.out.println("--------------------------------");
            System.out.println("Amount: " + totalAmount + " €");
            System.out.println("Quantity: " + pizza.getQuantity());
            System.out.println("--------------------------------");
            totalAmount += totalAmount * pizza.getQuantity();
        }
        System.out.println("Total amount: " + totalAmount + " €");
        System.out.println("********************************");
    }
}

