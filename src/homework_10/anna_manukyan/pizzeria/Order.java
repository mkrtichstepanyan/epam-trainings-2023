package homework_10.anna_manukyan.pizzeria;

import homework_10.anna_manukyan.pizzeria.CustomExceptions.ProductTypeException;
import homework_10.anna_manukyan.pizzeria.annotations.NotNull;
import homework_10.anna_manukyan.pizzeria.enums.ProductType;
import homework_10.anna_manukyan.pizzeria.pizza.Pizza;
import homework_10.anna_manukyan.pizzeria.product.Product;
import homework_10.anna_manukyan.pizzeria.product.Sweets;

import java.time.LocalTime;

public class Order {

    private static final int MAX_ITEM_AMOUNT = 10;
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialId = BASE_ORDER_NUMBER;
    private int index;
    private int orderNumber;
    private Customer customer;

    @NotNull
    private Product[] products = new Product[10];

    public LocalTime orderTime = LocalTime.now();

    Order() {
        orderNumber = initialId++;
    }

    void addFood(Product product) throws ProductTypeException {
        ProductType productType = product.getFoodType();
        if (product.getQuantity() > MAX_ITEM_AMOUNT) {
            System.out.println("hop axper jan!!");
            return;
        }
        if (productType == ProductType.PIZZA) {
            Pizza pizza = (Pizza) product;
            int pizzaIndex = index++;
            String validPizzaName = getValidPizzaName(pizza.getName(), pizzaIndex);
            products[pizzaIndex] = new Pizza(validPizzaName, pizza.getPizzaType(), pizza.getIngredients(), pizza.getQuantity(), productType);
        }
        if (productType == ProductType.SWEETS) {
            Sweets sweets = (Sweets) product;
            int sweetsIndex = index++;
            products[sweetsIndex] = new Sweets(sweets.getName(), sweets.getQuantity(), productType);
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

    public double calculateOrderAmount() {
        double totalSum = 0;
        for (Product product : products) {
            if (product != null) {
                totalSum += product.calculatePrice() * product.getQuantity();
            }
        }
        return totalSum;
    }

    void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product[] getFoods() {
        return products;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }
}
