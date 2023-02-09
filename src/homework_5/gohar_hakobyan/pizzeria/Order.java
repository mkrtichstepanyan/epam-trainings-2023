package homework_5.gohar_hakobyan.pizzeria;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private final int orderNumber;
    private Customer customer;
    private List<Pizza> pizzas;
    private final LocalTime orderTime;
    private static final int MAX_INGREDIENTS = 7;

    public Order(int orderNumber, Customer customer) {
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.pizzas = new ArrayList<>();
        this.orderTime = LocalTime.now();
    }

    public LocalTime getTime() {
        return LocalTime.now();
    }

    public void addPizza(String name, ArrayList<String> ingredients, int quantity, PizzaType pizzaType,
                         Customer customer) {
        if (name == null || name.length() < 4 || name.length() > 20) {
            name = customer.getName() + pizzas.size();
        }
        Pizza pizza = new Pizza(name, ingredients, quantity, pizzaType, customer);
        pizzas.add(pizza);
    }

    public void addIngredient(String pizzaName, String ingredient) {
        for (Pizza pizza : pizzas) {
            if (pizza.getName().equals(pizzaName)) {
                if (pizza.getIngredients().size() >= MAX_INGREDIENTS) {
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
        System.out.println("********************************");
        System.out.println("Order date and time: " + orderTime);
        System.out.println("Order: " + orderNumber);
        System.out.println("Client: " + customer.getCustomerPhone());
        double totalAmount = 0;
        totalAmount = getTotalAmount(totalAmount);
        System.out.println("Total amount: " + totalAmount + " $");
    }


    private double getPrice(Pizza pizza, double price) {
        for (String ingredient : pizza.getIngredients()) {
            double ingredientPrice = switch (ingredient) {
                case "Tomato paste" -> 1;
                case "Salami" -> 1.5;
                case "Cheese" -> 1;
                case "Bacon" -> 1.2;
                case "Garlic" -> 0.3;
                case "Corn" -> 0.7;
                case "Pepperoni" -> 0.6;
                case "Olives" -> 0.5;
                default -> 0;
            };
            System.out.println(ingredient + " " + ingredientPrice + " $");
            price += ingredientPrice;
        }
        return price;
    }


    private double getTotalAmount(double totalAmount) {
        for (Pizza pizza : pizzas) {
            if (pizza == null) {
                continue;
            }
            System.out.println("Name: " + pizza.getName());
            System.out.println("--------------------------------");
            double basePrice = 1;
            if (pizza.getPizzaType().equals(PizzaType.CALZONE)) {
                basePrice += 0.5;
                System.out.println("Pizza Base (Calzone) " + basePrice + " €");
            } else {
                System.out.println("Pizza Base (Regular) " + basePrice + " €");
            }
            basePrice = getPrice(pizza, basePrice);
            System.out.println("--------------------------------");
            System.out.println("Amount: " + basePrice + " $");
            System.out.println("Quantity: " + pizza.getQuantity());
            System.out.println("--------------------------------");
            totalAmount += basePrice * pizza.getQuantity();
        }
        return totalAmount;
    }

}

