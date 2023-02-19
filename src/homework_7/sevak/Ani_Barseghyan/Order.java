package homework_7.sevak.Ani_Barseghyan;

public class Order {
    private static final int MAX_PIZZA_AMOUNT = 10;
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialID = BASE_ORDER_NUMBER;
    private int index;
    private int orderNumber;
    private Customer customer;
    private Pizza[] pizzas = new Pizza[10];
    private Pizza pizza;

    Order() {
        orderNumber = initialID++;
    }

    public void addPizza(String pizzaName, PizzaType type, Ingredients[] ingredients, int quantity) {
        if (quantity > MAX_PIZZA_AMOUNT) {
            System.out.println("Hop axper jan");
            return;
        }
        int pizzaIndex = index++;
        String validPizzaName = getValidPizzaName(pizzaName, pizzaIndex);
        pizzas[pizzaIndex] = new Pizza(validPizzaName, type, ingredients, quantity);
    }


    private String getValidPizzaName(String pizzaName, int pizzaIndex) {
        String validPizzaName = pizzaName;
        if (!isValidPizzaName(pizzaName)) {
            validPizzaName = customer.getCustomerName() + "_" + pizzaIndex;
        }
        return validPizzaName;
    }

    private boolean isValidPizzaName(String pizzaName) {
        return pizzaName != null && pizzaName.length() > 4 && pizzaName.length() < 10;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double calculateOrderPrice() {
        double totalPrice = 0;
        for (Pizza pizza : pizzas) {
            totalPrice += pizza.calculatePrice() * pizza.getQuantity();
        }
        return totalPrice;
    }

    public void printOrderAttributes() {
        for (Pizza pizza : pizzas) {
            System.out.println("[" + orderNumber + customer.getCustomerNumber() + pizza.getName() + pizza.getQuantity() + "]");
        }
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getCustomerNumber() {
        return customer.getCustomerName();
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }
}
