package homework_7.Ani_Barseghyan;

public class Order {
    private static final int MAX_AMOUNT = 10;
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialID = BASE_ORDER_NUMBER;
    private int index;
    private int orderNumber;
    private Customer customer;
    private Product[] products = new Product[10];

    Order() {
        orderNumber = initialID++;
    }


    public void addProduct(Product product) {
        if (product.getQuantity() > MAX_AMOUNT) {
            System.out.println("Hop axper jan");
            return;
        }
        String validName = getValidName(product.getName(), index);
        if (product.getProductType().getType().equals("pizza")) {
            Ingredients[] ing = Pizza.getIngredients();
            products[index++] = new Pizza(validName, product.getProductType(), ing, product.getQuantity());
        } else {
            products[index++] = new Beverage(validName, product.getProductType(), product.getQuantity());
        }
    }

    private String getValidName(String name, int pizzaIndex) {
        String validName = name;
        if (!isValidName(name)) {
            validName = customer.getCustomerName() + "_" + pizzaIndex;
        }
        return validName;
    }

    private boolean isValidName(String name) {
        return name != null && name.length() >= 4 && name.length() < 10;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double calculateOrderPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.calculatePrice() * product.getQuantity();
        }
        return totalPrice;
    }

    public void printOrderAttributes() {
        for (Product product : products) {
            System.out.println("[" + orderNumber + customer.getCustomerNumber() + product.getName() + product.getQuantity() + "]");
        }
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getCustomerNumber() {
        return customer.getCustomerName();
    }

    public Product[] getProducts() {
        return products;
    }
}
