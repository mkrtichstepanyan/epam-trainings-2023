package homework_7.Sofya_Ghazaryan.Pizza.model;

import homework_7.Sofya_Ghazaryan.Pizza.interfaces.OrderInter;

import java.time.LocalDateTime;

public class Order implements OrderInter {
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialID = BASE_ORDER_NUMBER;
    private static final int MAX_PIZZA_AMOUNT = 10;


    private int index;
    private int orderNumber;
    private User user;
    private Product[] products = new Product[50];

    private int drinkIndex;
    private LocalDateTime orderTime;


    public Order() {
        orderNumber = initialID++;
        orderTime = LocalDateTime.now();
    }

    public void addProduct(String productName, ProductType productType,
                           Ingredient[] ingredients, int quantity) {
        if (quantity > MAX_PIZZA_AMOUNT) {
            System.out.println("You cannot order more then " + MAX_PIZZA_AMOUNT + " pizza");
            return;
        }
        int pizzaIndex = index++;
        String validPizzaName = getValidPizzaName(productName, pizzaIndex);
        products[pizzaIndex] = new Pizza(validPizzaName, productType, ingredients, quantity);
    }


    @Override
    public void addDrink(Product drink, int quantity) {
        if (drinkIndex < 10) {
            for (int i = 0; i < drinkIndex; i++) {
                if (products[i] != null && products[i].equals(drink)) {
                    products[i].setQuantity(products[i].getQuantity() + quantity);
                    return;
                }
            }
            drink.setQuantity(quantity);
            products[10 + drinkIndex++] = drink;
        } else {
            System.out.println("Tou cannot order more then 10 drinks.");
        }
    }


    @Override
    public double calculateOrderPrice() {
        double totalAmount = 0.0;
        for (Product product : products) {
            if (product != null) {
                totalAmount += product.calculatePrice();
            }
        }
        return totalAmount;
    }

    private String getValidPizzaName(String pizzaName, int pizzaIndex) {
        String validPizzaName = pizzaName;
        if (!isValidPizzaName(pizzaName)) {
            validPizzaName = user.getUserName() + "_" + pizzaIndex;
        }
        return validPizzaName;
    }

    private boolean isValidPizzaName(String pizzaName) {
        return pizzaName != null && pizzaName.length() > 4 && pizzaName.length() < 20;
    }


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }


    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }
}
