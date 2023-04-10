package homework_7.Anush_Ananyan;

import homework_7.Anush_Ananyan.ProductType.*;
import homework_7.Anush_Ananyan.Product.*;

import java.lang.*;

public class Order {
    private static final int MAX_PRODUCT_AMOUNT = 10;
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialId = BASE_ORDER_NUMBER;

    private int index;
    private int orderNumber;
    private Customer customer;
    private Product[] products = new Product[10];


    public Order() {
        orderNumber = initialId++;
    }

    public void addProduct(String productName, ProductType productType,
                           Ingredient[] ingredients, int quantity) {
        if (quantity > MAX_PRODUCT_AMOUNT) {
            System.out.println("You can't order more than 10 products");
            return;
        }
        if (productType.getClass().getSimpleName().equals("PizzaType")) {
            int productIndex = index++;
            String validPizzaName = getValidPizzaName(productName, productIndex);
            products[productIndex] = new Pizza(validPizzaName, productType, ingredients, quantity);
        } else if (productType.getClass().getSimpleName().equals("SaladType")) {
            int productIndex = index++;
            products[productIndex] = new Salad(productName, productType, quantity);
        }
    }


    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double calculateOrderPrice() {
        double orderPrice = 0.0;
        for (Product product : products) {
            if (product != null) {
                orderPrice += product.calculatePrice() * product.getQuantity();
            }
        }
        return orderPrice;
    }

    public void printOrderAttributes() {
        for (Product product : products) {
            System.out.println("[" + orderNumber + customer.getNumber() +
                    product.getName() + product.getQuantity() + "]");
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

    public Customer getCustomer() {
        return customer;
    }

    public Product[] getProducts() {
        return products;
    }
}
