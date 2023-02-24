package homework_7.gohar_hakobyan;

import homework_7.gohar_hakobyan.product.Product;

public class Order {
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialId = BASE_ORDER_NUMBER;
    private static int orderNumber;
    private Customer customer;
    private Product[] products = new Product[10];

    Order() {
        orderNumber = initialId++;
    }

    public Order(Product[] products, int orderNumber, Customer customer) {
        this.products =products;
        this.orderNumber= orderNumber;
        this.customer= customer;
    }


    public static Order makeOrder(Product[] products, Customer customer) {
        return new Order(products, orderNumber++, customer);
    }

    public double calculateOrderAmount() {
        double amount = 0.0;
        for (Product product : products) {
            if (product != null) {
                amount += product.getQuantity() * product.calculatePrice();
            }
        }
        return amount;
    }

    public void printOrderAttributes() {
        for (Product product : products) {
            System.out.println("[" + orderNumber + customer.getNumber() + product.getName()
                    + product.getQuantity() + "]");
        }
    }


    public int getOrderNumber() {
        return orderNumber;
    }

    public int getCustomerNumber() {
        return customer.getNumber();
    }

    public Product[] getProducts() {
        return products;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
