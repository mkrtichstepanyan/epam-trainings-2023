package homework_5.Lilit_Adamyan.Pizza;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int orderCounter = 10001;
    private final int orderNumber;
    private Customer customer;
    private final List<Pizza> pizzas;
    private LocalTime orderTime;
    private int counter = 0;

    public Order(Customer customer) {
        this.orderNumber = orderCounter++;
        this.customer = customer;
        this.pizzas = new ArrayList<>();
        this.orderTime = LocalTime.now();

    }

    public LocalTime getOrderTime() {
        return orderTime;
    }

    public void addPizza(Pizza pizza) {
        counter+=pizza.getQuantity();
        if(counter>10){
            System.out.println("You can't order pizza more than 10");
            return;
        }
      pizzas.add(pizza);
    }

    public void displayPizzaAttributes() {
        for (int i = 0; i < pizzas.size(); i++) {
            Pizza pizza = pizzas.get(i);
            System.out.println("[" + orderNumber + " : " + customer.getId() +
                    " : " + pizza.getName() +
                    " : " + pizza.getQuantity() +
                    " : " + orderTime + "]");
        }
    }

    public void printCheck() {
        System.out.println("*************************");
        System.out.println("Order: " + this.orderNumber);
        System.out.println("Client: " + customer.getId());

        double totalAmount = 0;
        for (Pizza pizza : this.pizzas) {

            System.out.println("Name: " + pizza.getName());
            System.out.println("____________________________");

            double pizzaAmount = 0;
            for (String ingredient : pizza.getIngredients()) {
                double ingredientPrice = 0;
                switch (ingredient) {
                    case "Tomato paste":
                        ingredientPrice = 1;
                        break;
                    case "Cheese":
                        ingredientPrice = 1.0;
                        break;
                    case "Salami":
                        ingredientPrice = 1.5;
                        break;
                    case "Bacon":
                        ingredientPrice = 1.2;
                        break;
                    case "Garlic":
                        ingredientPrice = 0.3;
                        break;
                    case "Corn":
                        ingredientPrice = 0.7;
                        break;
                    case "Pepper":
                        ingredientPrice = 0.6;
                        break;
                    case "Olives":
                        ingredientPrice = 0.5;
                        break;
                }
                System.out.println(ingredient + " " + ingredientPrice + " €");
                pizzaAmount += ingredientPrice;
            }
            pizzaAmount += (pizza.getType().equals("Pizza Base (Calzone)") ? 1.5 : 1);
            System.out.println("_________________________________");
            System.out.println("Amount: " + pizzaAmount + " €");
            System.out.println("Quantity: " + pizza.getQuantity());
            System.out.println("__________________________________");
            totalAmount += pizzaAmount * pizza.getQuantity();
        }
        System.out.println("Total amount: " + totalAmount + " €");
        System.out.println("*************************************");


    }
}