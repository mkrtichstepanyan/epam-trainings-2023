package homework_7.Alina_Mkhoyan.pizza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {
    private static final int MAX_PIZZA_AMOUNT = 10;
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialId = BASE_ORDER_NUMBER;

    private int index;
    private int orderNumber;
    private Customer customer;
    private Pizza[] pizzas = new Pizza[2];
    private List<Drink> drinks = new ArrayList<>();

    Order() {
        orderNumber = initialId++;
    }

    public void addPizza(String pizzaName, PizzaType type,  Ingredient[] ingredients, int quantity) {
        if (quantity > MAX_PIZZA_AMOUNT) {
            System.out.println("hop axper jan!!");
            return;
        }
        int pizzaIndex = index++;
        String validPizzaName = getValidPizzaName(pizzaName, pizzaIndex);
        pizzas[pizzaIndex] = new Pizza(validPizzaName, type, ingredients, quantity);
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double calculateOrderPrice() {
//            double orderPrice = 0.0d;
//
//            for (Pizza pizza : pizzas) {
//                orderPrice += pizza.calculatePrice();
//            }
//            return orderPrice;
//        }
        double orderPrice = 0.0;
        for (Pizza pizza : pizzas) {
            if (pizza != null) {
                orderPrice += pizza.calculatePrice();
            }
        }
        return orderPrice;
    }

    // todo calculate order total price


    public void printOrderAttributes() {
        for (Pizza pizza : pizzas) {
            if (pizza != null) {
                System.out.println("Pizza Name: " + pizza.getName() + "\n"
                        + "Pizza Type: " + pizza.getPizzaType().getName() + " "
                        + pizza.getPizzaType().getPrice() + " $" + "\n"
                        + "Ingredients: " + Arrays.toString(pizza.getIngredients()) + "\n"
                        + "Price: " + pizza.calculatePrice() + "\n"
                        + "---------------------");
                System.out.println("Drinks: ");
                for (Drink drink : drinks) {
                    drink.printProductDetails();
                    System.out.println("- " + drink.getName() + " ($" + drink.calculatePrice() + ")");
                }
            } else {
                return;
            }
        }
    }

    private String getValidPizzaName(String pizzaName, int pizzaIndex) {
        String validPizzaName = pizzaName;
        if (!isValidPizzaName(pizzaName)) {
            validPizzaName = customer.getName() + "_" + pizzaIndex;
        }
        return validPizzaName;
    }

    private boolean isValidPizzaName(String pizzaName) {
        return pizzaName != null && pizzaName.length() > 4 && pizzaName.length() < 20;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public int getIndex() {
        return index;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }
}
