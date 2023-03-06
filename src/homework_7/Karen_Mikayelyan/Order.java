package homework_7.Karen_Mikayelyan;

import java.time.LocalTime;

public class Order {
    private static final int MAX_ITEM_AMOUNT = 10;
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialId = BASE_ORDER_NUMBER;

    private int index;
    private int orderNumber;
    private Customer customer;
    private Product[] products = new Product[10];
    public LocalTime orderTime = LocalTime.now();

    Order() {
        orderNumber = initialId++;
    }

    public void addProduct(Product product) throws ItemSizeOutOfBoundsException {
        try {
            ProductType productType = product.productType;
            if (product.getQuantity() > MAX_ITEM_AMOUNT) {
                throw new ItemSizeOutOfBoundsException();
            }

            if (productType == ProductType.PIZZA) {
                Pizza pizza = (Pizza) product;
                int pizzaIndex = index++;
                String validPizzaName = getValidPizzaName(pizza.getName(), pizzaIndex);
                products[pizzaIndex] = new Pizza(validPizzaName, pizza.getPizzaType(), pizza.getIngredients(), pizza.getQuantity(), productType);
            }
            if (productType == ProductType.DRINK) {
                Drink drinks = (Drink) product;
                int drinksIndex = index++;
                products[drinksIndex] = new Drink(drinks.getName(), drinks.getDrinkType(), drinks.getQuantity());
            }
        } catch (ItemSizeOutOfBoundsException e) {
            System.out.println("The max number of " + product.getName() + " can not be more than 10! " + " and we will add only 10");
        }
    }

    public double calculateOrderPrice() {
        double orderPrice = 0.0;
        for (Product product : products) {
            if (product != null) {
                orderPrice += product.calculatePrice() * product.getQuantity();
            }
        }
        return orderPrice;
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

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product[] getProducts() {
        return products;
    }

    public int getOrderNumber() {
        return orderNumber;
    }
}
