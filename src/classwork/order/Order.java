package classwork.order;

import classwork.Ingredient;
import classwork.Product;
import classwork.ProductType;
import classwork.annotationexample.Customer;

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

    public void addProduct(String productName, ProductType type, Ingredient[] ingredients, int quantity) {
        if (quantity > MAX_PIZZA_AMOUNT) {
            System.out.println("hop axper jan!!");
            return;
        }
        int pizzaIndex = index++;
        String validPizzaName = getValidPizzaName(productName, pizzaIndex);
//        products[pizzaIndex] = new Pizza(validPizzaName, type, ingredients, quantity);
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double calculateOrderPrice() {
        double price = 0.0;
        for (Product product : products) {
            price += product.calculatePrice();
        }
        return price;
    }


    public void printOrderAttributes() {
        for (Product product : products) {
            System.out.println("[" + orderNumber + customer.getNumber() + product.getName() + product.getQuantity() + "]");
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
}
