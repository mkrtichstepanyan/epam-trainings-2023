package homework_7.Roza_Petrosyan;

public class Order {
    private static final int MAX_PIZZA_AMOUNT = 10;
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialId = BASE_ORDER_NUMBER;

    private int index;
    private int orderNumber;
    private Customer customer;
    private Product[] products = new Product[10];

    Order() {
        orderNumber = initialId++;
    }

    public void addProduct(String productName, ProductType productType, Ingredient[] ingredients, int quantity) {
        int productIndex = 0;
        if (quantity > MAX_PIZZA_AMOUNT) {
            System.out.println("You can not order more than 10 pizzas!");
            return;
        }
        if (productType.getClass().getSimpleName().equals("PizzaType")) {
            productIndex = index++;
            String validPizzaName = getValidPizzaName(productName, productIndex);
            products[productIndex] = new Pizza(validPizzaName, productType, ingredients, quantity);
        } else if (productType.getClass().getSimpleName().equals("DrinkType")) {
            productIndex = index++;
            products[productIndex] = new Drink(productName, productType, quantity);
        }
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double calculateOrderPrice() {

        // todo calculate order total price
        double totalPrice = 0;
        for (Product product : products) {
            if (product != null) {
                if (product.getClass().getSimpleName().equals("Pizza")) {
                    Pizza pizza = (Pizza) product;
                    if(!pizza.isDuplicate(pizza.getIngredients()) && pizza.getMaxCount() < 7){
                        totalPrice += pizza.calculatePrice() * pizza.getQuantity();
                    }
                }else {
                    totalPrice += product.calculatePrice() * product.getQuantity();
                }
            }
        }
        return totalPrice;
    }


    public void printOrderAttributes() {
        for (Product product : products) {
            if (product != null) {
                System.out.println("[" + orderNumber + ":"
                        + customer.getNumber() + ":"
                        + product.getName() + ":"
                        + product.getQuantity() + "]");
            }
        }
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

    public int getOrderNumber() {
        return orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product[] getProducts() {
        return products;
    }
}
