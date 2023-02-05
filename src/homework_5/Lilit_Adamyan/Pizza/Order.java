package homework_5.Lilit_Adamyan.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final int orderNumber;
    private final int customerNumber;
    private final List<Pizza> pizzas;

    public Order(int orderNumber, int customerNumber) {
        this.orderNumber = orderNumber;
        this.customerNumber = customerNumber;
        this.pizzas = new ArrayList<>();
    }

    public void addPizza(Pizza pizza) {
        if (pizza.getName().length() < 4 || pizza.getName().length() > 20) {
            pizza.setName("customer_" + customerNumber + "_" + (pizzas.size() + 1));
        }
        pizzas.add(pizza);
    }

    public void displayPizzaAttributes() {
        for (int i = 0; i < pizzas.size(); i++) {
            Pizza pizza = pizzas.get(i);
            System.out.println("[" + orderNumber + " : " + customerNumber + " : " + pizza.getName() + " : " + pizza.getQuantity() + "]");
        }
    }

    public void printCheck() {
        System.out.println("*************************");
        System.out.println("Order: " + this.orderNumber);
        System.out.println("Client: " + this.customerNumber);

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