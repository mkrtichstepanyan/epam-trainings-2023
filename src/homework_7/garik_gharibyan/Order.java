package homework_7.garik_gharibyan;

import homework_7.garik_gharibyan.product.Product;
import homework_7.garik_gharibyan.product.food.pizza.Pizza;

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


    public void addProduct(Product product, int quantity) {
        product.setQuantity(quantity);
        int index = this.index++;

        if (product.getClass() == Pizza.class) {
            ProductIsPizza(product, quantity,index);
        }else {
            products[index] = product;

        }
    }

    private void ProductIsPizza(Product product, int quantity ,int index) {
        Pizza pizza = (Pizza) product;

        if (quantity > MAX_FOOD_AMOUNT) {
            System.out.println("hop axper jan!!");
            return;
        }

        String validPizzaName = getValidPizzaName(pizza.getName(), index);

        Pizza newPizza = new Pizza(validPizzaName, pizza.getPizzaType(), pizza.getIngredients());
        newPizza.setQuantity(quantity);

        products[index] = newPizza;
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
