package homework_7.Yeghia_Ansuryan.Palmetto;

public class Order {
    public static final String PRODUCT_PIZZA = "Pizza";
    private static final int MAX_PIZZA_AMOUNT = 10;
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialId = BASE_ORDER_NUMBER;

    private int index;
    private int orderNumber;
    private Customer customer;
    private Product[] products = new Product[10];

    private double totalPrice = 0.0;

    Order(Customer customer) {
        this.customer = customer;
        orderNumber = initialId++;
    }

    public void addProduct(Product product) {
        if (index > MAX_PIZZA_AMOUNT) {
            System.out.println(" You are not allowed to arder more than 10 productes!!");
            return;
        }
        getValidProductName(product.getName(), index);
        products[index++] = product;
    }

    private String getValidProductName(String productName, int productIndex) {
        String validProductName = productName;
        if (!isValidProductName(productName)) {
            validProductName = customer.getName() + "_" + productIndex;
        }
        return validProductName;
    }

    private boolean isValidProductName(String pizzaName) {
        return pizzaName != null && pizzaName.length() > 4 && pizzaName.length() < 20;
    }

    public void calculateOrderPrice() {
        for (int i = 0; i <= products.length; i++) {
            double eachProductPrice = products[i].calculatePrice() * products[i].getQuantity();
            this.totalPrice += eachProductPrice;
        }
    }

    public void printOrderAttributes() {
        for (Product product : products) {
            System.out.println("[" + orderNumber + customer.getNumber() + product.getName() + product.getQuantity() + "]");
        }
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Product[] getProducts() {
        return products;
    }

    public Customer getCustomer() {
        return customer;
    }
}
