package homework_7.Hovhannes_Gspeyan.palmetto;

import homework_7.Hovhannes_Gspeyan.palmetto.menu.MenuItem;
import homework_7.Hovhannes_Gspeyan.palmetto.menu.Pizza;

public class Order {
    private static final int MAX_AMOUNT = 10;
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialId = BASE_ORDER_NUMBER;
    private static int orderNumber;
    private Customer customer;
    private MenuItem[] items = new MenuItem[10];

    public Order() {

    }

    public Order(MenuItem[] items, Customer customer) {
        this.items = items;
        this.customer = customer;
    }

    public static Order createOrder(MenuItem[] items, Customer customer) {
        return new Order(items, customer);
    }

    public void addPizza(Pizza pizza, int quantity) {
        if (quantity > MAX_AMOUNT) {
            System.out.println("The max number of " + pizza.getName() + "'s" + " can't be more than 10! "+ "so we will add only 10");
            pizza.setQuantity(10);
        }
        String validPizzaName = pizza.getName();
        MenuItem[] newItems = new MenuItem[items.length + 1];
        System.arraycopy(items, 0, newItems, 0, items.length);
        newItems[items.length] = new Pizza(validPizzaName, pizza.getPizzaType(), pizza.getIngredients(), pizza.getQuantity());
        items = newItems;
    }

    public double calculateOrderAmount() {
        double amount = 0.0;
        for (MenuItem item : items) {
            if (item != null) {
                amount += item.calculatePrice();
            }
        }
        return amount;
    }

    public void printOrderAttributes() {
        System.out.print("[ " + initialId + ", " + customer.getNumber() + ", ");
        for (int i = 0; i < items.length; i++) {
            MenuItem item = items[i];
            System.out.print(item.getName() + "-" + item.getQuantity());
            if (i < items.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(" ]");
    }

    public int getOrderNumber() {
        return orderNumber = initialId++;
    }

    public Customer getCustomer() {
        return customer;
    }

    public MenuItem[] getItems() {
        return items;
    }
}
