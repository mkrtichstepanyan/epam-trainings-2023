package homework_10.Inesa_Mkrtchyan.Pizza;

import homework_10.Inesa_Mkrtchyan.Ex.MyException;

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

    public void addPizza(String pizzaName, PizzaType type, PizzaIngredient[] ingredients, int quantity) throws MyException {
        if (quantity > MAX_PIZZA_AMOUNT || getProducts().length >= MAX_PIZZA_AMOUNT) {
            //System.out.println("Order is full!!");
            throw new MyException("Order is full !!!");
        }
        int pizzaIndex = index++;
        String validPizzaName = getValidPizzaName(pizzaName, pizzaIndex);
        products[pizzaIndex] = new Pizza(validPizzaName, type, ingredients, quantity);
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double calculateOrderPrice() {
        int price = 0;
        for (Product p : products) {
            if(p != null) price += p.calculatePrice() * p.quantity;
        }
        return price;
    }

    public void printOrderAttributes() {
        for (Product pizza : products) {
            System.out.println("[" + orderNumber + customer.getNumber() + pizza.getName() + pizza.getQuantity() + "]");
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

    public int getIndex() {
        return index;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product[] getProducts() {
        int count = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) count++;
        }
        Product[] p = new Product[count];
        for (int i = 0; i < count; i++) {
            p[i] = products[i];
        }

        return p;
    }
}
