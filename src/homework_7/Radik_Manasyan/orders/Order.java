package homework_7.Radik_Manasyan.orders;

import homework_7.Radik_Manasyan.customer.Customer;
import homework_7.Radik_Manasyan.products.Products;

public abstract class Order {
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialId = BASE_ORDER_NUMBER;
    public final Products[] products = new Products[10];
    private int index;
    private int orderNumber;

    public void addOrderByProducts(Products product){
        products[index++] = product;
    }

    private Customer customer;

    public abstract double calculateOrderPrice();

    public void printOrderAttributes() {
        for (int i = 0; i < index; i++) {
            System.out.println("[" + orderNumber + ": " + customer.getNumber() + ": " + products[i].getName() + ": " + products[i].getQuantity() + "]");
        }
    }

    public Products[] getOrder() {
        return products;
    }
    public static void setInitialId(int initialId) {
        Order.initialId = initialId;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
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
}
