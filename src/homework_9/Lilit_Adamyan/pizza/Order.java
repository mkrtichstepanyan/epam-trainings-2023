package homework_9.Lilit_Adamyan.pizza;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static final int MAX_PIZZA_AMOUNT = 10;
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialId = BASE_ORDER_NUMBER;

    private int index;
    private int orderNumber;
    private Customer customer;

    private final Product[] products = new Product[10];

    Order() {
        orderNumber = initialId++;
    }

    public void addProduct(String productName, PizzaType type, Ingredients ingredients, int quantity) {
        if (quantity > MAX_PIZZA_AMOUNT) {
            System.out.println("hop axper jan!!");
            return;
        }
        int pizzaIndex = index++;
        String validPizzaName = getValidPizzaName(productName, pizzaIndex);
        products[pizzaIndex] = new Pizza(validPizzaName, type, ingredients, quantity, customer);
        addProduct(products[pizzaIndex]);
    }

    public double calculateOrderPrice() {
        double total = 0.0;
        for (Product product : products) {
            total += product.calculatePrice();
        }
        return total;
    }

    public void addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getName().equals(product.getName())) {
                products[i].addQuantity(product.getQuantity());
                return;
            }
        }
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                return;
            }
        }
        System.out.println("Maximum number of products has been reached.");
    }

    public void printOrderAttributes() {
        for (Product product : products) {
            if (product != null) {
                System.out.println("[" + orderNumber + ":" + customer.getNumber() + ":" + product.getName() + ":" + product.getQuantity() + "]");
            }
        }
    }

    private String getValidPizzaName(String pizzaName, int pizzaIndex) {
        String validPizzaName = pizzaName;
        if (pizzaName!=null){
            if (isValidPizzaName(pizzaName)) {
                validPizzaName = customer.getName() + "_" + pizzaIndex;  //spasi
            }
        }
        return validPizzaName;
    }
    public Pizza[] getPizzas() {
        List<Pizza> pizzas = new ArrayList<>();
        for (Product product : products) {
            if (product instanceof Pizza) {
                pizzas.add((Pizza) product);
            }
        }
        return pizzas.toArray(new Pizza[0]);
    }

    private boolean isValidPizzaName(String pizzaName) {
        return  pizzaName.length() < 4 || pizzaName.length() > 20;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public static int getInitialId() {
        return initialId;
    }

    public int getIndex() {
        return index;
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
