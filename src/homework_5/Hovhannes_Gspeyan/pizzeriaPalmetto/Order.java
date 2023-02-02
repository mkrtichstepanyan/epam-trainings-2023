package homework_5.Hovhannes_Gspeyan.pizzeriaPalmetto;

import java.time.LocalDateTime;
/**
 * This class built to implement
 * customers orders objects
 * from our pizzeria Palmetto
 */
public class Order {

    // declares order number
    private final int orderNumber;

    // declares five - digit number for order number
    private static int nextOrderNumber = 10001;

    // declares customer number
    private final int customerNumber;

    // array keeps pizza objects
    private final Pizza[] pizzas;

    // declares order date and time
    private final LocalDateTime orderTime;

    // order objects constructor with 3 args as parameters
    // also provides order number to automatically rise up
    public Order(int customerNumber, int numPizzas) {
        this.orderNumber = nextOrderNumber++;
        this.customerNumber = customerNumber;
        this.pizzas = new Pizza[numPizzas];
        this.orderTime = LocalDateTime.now();
    }

    // allows order to add pizza objects
    public void addPizza(Pizza pizza, int index) {
        pizzas[index] = pizza;
    }

    // displays pizza attributes
    public void displayPizzaAttributes(Pizza pizza) {
        if (pizza != null) {
            System.out.println("--------------------------------");
            System.out.println("[" + orderNumber + ": " + customerNumber + ": " + pizza.getName() + ": " + pizza.getQuantity() + "]");
        }
    }
    // prints tickets for customers to provide them to see their orders
    public void printCheck() {
        System.out.println("********************************");
        System.out.println("Order date and time: " + orderTime);
        System.out.println("Order: " + orderNumber);
        System.out.println("Client: " + customerNumber);
        double totalAmount = 0;
        totalAmount = getTotalAmount(totalAmount);
        System.out.println("Total amount: " + totalAmount + " $");
    }

    // private utility method gets base price for printCheck() method
    private double getBasePrice(Pizza pizza, double basePrice) {
        for (String ingredient : pizza.getIngredients()) {
            double ingredientPrice = switch (ingredient) {
                case "Tomato paste", "Cheese" -> 1;
                case "Salami" -> 1.5;
                case "Bacon" -> 1.2;
                case "Garlic" -> 0.3;
                case "Corn" -> 0.7;
                case "Pepperoni" -> 0.6;
                case "Olives" -> 0.5;
                default -> 0;
            };
            System.out.println(ingredient + " " + ingredientPrice + " $");
            basePrice += ingredientPrice;
        }
        return basePrice;
    }

    // private utility method gets total amount for printCheck() method
    private double getTotalAmount(double totalAmount) {
        for (Pizza pizza : pizzas) {
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
