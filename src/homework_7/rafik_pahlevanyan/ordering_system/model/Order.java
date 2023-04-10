package homework_7.rafik_pahlevanyan.ordering_system.model;

import homework_7.rafik_pahlevanyan.ordering_system.pizza.Ingredient;
import homework_7.rafik_pahlevanyan.ordering_system.pizza.Pizza;
import homework_7.rafik_pahlevanyan.ordering_system.product.Product;
import homework_7.rafik_pahlevanyan.ordering_system.product.ProductType;

public class Order {

    private static final int MAX_PIZZA_AMOUNT = 10;
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialId = BASE_ORDER_NUMBER;

    private int orderNumber;
    private Customer customer;
    private int index;

    private Product[] products = new Product[40];

    private int drinkIndex;

    public Order() {
        orderNumber = initialId++;
    }

    public void addProduct(String productName, ProductType productType, Ingredient[] ingredients,
                           int quantity) {
        if (quantity > MAX_PIZZA_AMOUNT) {
            System.out.println("Max pizza amount is reached!!!!");
            return;
        }
        int pizzaIndex = index++;
        String validPizzaName = getValidPizzaName(productName, pizzaIndex);
        products[pizzaIndex] = new Pizza(validPizzaName, productType, ingredients, quantity);


    }

    public void addDrink(Product drink, int quantity) {
        if (drinkIndex < 10) {
            for (int i = 0; i < drinkIndex; i++) {
                if (products[i] != null && products[i].equals(drink)) {
                    products[i].setQuantity(products[i].getQuantity() + quantity);
                    return;
                }
            }
            drink.setQuantity(quantity);
            products[10 + drinkIndex++] = drink;
        } else {
            System.out.println("Maximum number of drinks reached!");
        }
    }

    public double calculateOrderPrice() {

        double price = 0.0;
        for (Product product : products) {
            if (product != null) {
                price += product.calculatePrice();
            }
        }


        return price;
    }

    public void printOrderAttributes() {
        for (Product product : products) {
            if (product != null) {
                System.out.println("[" + orderNumber + " : " + customer.getNumber() + " : " + product.getName() + " : " + product.getQuantity() + "]");
            }
        }
    }


    public int getOrderNumber() {
        return orderNumber;
    }


    public Product[] getProducts() {
        return products;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
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


}
