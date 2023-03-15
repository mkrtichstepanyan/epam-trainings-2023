package homework_10.Vladimir_Vanyan.Pizza_Project;

import homework_10.Vladimir_Vanyan.Exceptions.InvalidAmountException;
import homework_10.Vladimir_Vanyan.Exceptions.InvalidNameException;

public class Order {
    private static final int MAX_FOOD_AMOUNT = 10;
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialId = BASE_ORDER_NUMBER;
    private int index;
    private final int orderNumber;
    private Customer customer;
    private final Product[] products = new Product[100];


    public Product[] getProducts() {
        return products;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }


    public Order() {
        orderNumber = initialId++;
    }


    public void addProduct(Product product, int quantity) throws InvalidAmountException, InvalidNameException {

        for (Product product1 : products) {
            if (product.equals(product1)) {
                product1.setQuantity(product1.getQuantity() + quantity);
                return;
            }
        }

        product.setQuantity(quantity);
        int index = this.index++;

        if (product.getClass() == Pizza.class) {
            productIsPizza((Pizza) product, quantity, index);
        } else {
            products[index] = product;

        }
    }

    private void productIsPizza(Pizza pizza, int quantity, int index) throws InvalidAmountException, InvalidNameException {

        if (quantity > MAX_FOOD_AMOUNT) {
            // System.out.println("hop axper jan!!");
            // return;
            throw new InvalidAmountException("Quantity is enough");
        }

        String validPizzaName = getValidPizzaName(pizza.getName(), index);

        Pizza newPizza = new Pizza(validPizzaName, pizza.getPizzaType(), pizza.getIngredients());
        newPizza.setQuantity(quantity);

        products[index] = newPizza;
    }

    private String getValidPizzaName(String pizzaName, int pizzaIndex) throws InvalidNameException {
        String validPizzaName = pizzaName;
        if (!isValidPizzaName(pizzaName)) {
            throw new InvalidNameException("Pizza Name is invalid");
        }
        return validPizzaName;
    }

    private boolean isValidPizzaName(String pizzaName) {
        return pizzaName != null && pizzaName.length() > 4 && pizzaName.length() < 20;
    }


    public double calculateTotalPriceOfOrder() {

        double totalProductPrice = 0;
        for (Product product : products) {
            if (product == null) {
                break;
            }
            totalProductPrice = product.getPrice() * product.getQuantity() + totalProductPrice;
        }
        return totalProductPrice;
    }

}
