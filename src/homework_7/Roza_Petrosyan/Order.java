package homework_7.Roza_Petrosyan;

import homework_7.Roza_Petrosyan.exceptions.product_exceptions.PizzaNameException;
import homework_7.Roza_Petrosyan.exceptions.product_exceptions.ProductQuantityException;
import homework_7.Roza_Petrosyan.product.*;
import homework_7.Roza_Petrosyan.productType.*;

public class Order {
    private static final int MAX_PIZZA_AMOUNT = 10;
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialId = BASE_ORDER_NUMBER;

    private int index;
    private int orderNumber;
    private Customer customer;
    private Product[] products = new Product[10];

    Order() {
        orderNumber = initialId++;
    }

    public void addProduct(String productName, ProductType productType, Ingredient[] ingredients, int quantity) {
        int productIndex = 0;
        try {
            if (quantity > MAX_PIZZA_AMOUNT) {
                throw new ProductQuantityException();
            }
        } catch (ProductQuantityException e){
            System.out.println(e.getMessage());
            return;
        }
        if (productType.getClass().getSimpleName().equals("PizzaType")) {
            productIndex = index++;
            String validPizzaName = getValidPizzaName(productName, productIndex);
            products[productIndex] = new Pizza(validPizzaName, productType, ingredients, quantity);
        } else if (productType.getClass().getSimpleName().equals("DrinkType")) {
            productIndex = index++;
            products[productIndex] = new Drink(productName, productType, quantity);
        }
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double calculateOrderPrice() {

        // todo calculate order total price
        double totalPrice = 0;
        for (Product product : products) {
            if (product != null) {
                if (product.getClass().getSimpleName().equals("Pizza")) {
                    Pizza pizza = (Pizza) product;
                    totalPrice += pizza.calculatePrice() * pizza.getQuantity();
                } else {
                    totalPrice += product.calculatePrice() * product.getQuantity();
                }
            }
        }
        return totalPrice;
    }


    public void printOrderAttributes() {
        for (Product product : products) {
            if (product != null) {
                System.out.println("[" + orderNumber + ":"
                        + customer.getNumber() + ":"
                        + product.getName() + ":"
                        + product.getQuantity() + "]");
            }
        }
    }

    private String getValidPizzaName(String pizzaName, int pizzaIndex) {
        String validPizzaName = pizzaName;
        if (!isValidPizzaName(pizzaName)) {
            if(customer.getName() != null) {
                validPizzaName = customer.getName() + "_" + pizzaIndex;
            }
        }
        return validPizzaName;
    }

    private boolean isValidPizzaName(String pizzaName) {
        boolean result = false;
        try {
            if (pizzaName != null) {
                if (pizzaName.length() > 4 && pizzaName.length() < 20 && pizzaName.matches("\\p{IsLatin}+")) {
                   result = true;
                } else {
                    throw new PizzaNameException();
                }
            } else {
                throw new NullPointerException("Pizza name can not be null.");
            }

        } catch (PizzaNameException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product[] getProducts() {
        return products;
    }
}
