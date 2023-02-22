package homework_7.Hovhannes_Gspeyan;

import homework_7.Hovhannes_Gspeyan.palmetto.menu.MenuItem;

public class Order {
    private static final int MAX_AMOUNT = 10;
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialId = BASE_ORDER_NUMBER;
    private int index;

    private static int orderNumber;
    private Customer customer;

    private MenuItem[] items = new MenuItem[10];


    public Order(MenuItem[] items, Customer customer) {
        this.items = items;
        this.customer = customer;
    }

    public static Order createOrder(MenuItem[] items, Customer customer) {
        return new Order(items, customer);
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
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
        for (MenuItem item : items) {
            System.out.print(item.getName() + "-" + item.getQuantity());

                System.out.print(", ");
        }
        System.out.print("]");
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
