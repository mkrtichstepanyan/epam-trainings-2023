package homework_7.Hovhannes_Abrahamyan;

public class Order {
    private static final int MAX_PIZZA_AMOUNT = 10;
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialId = BASE_ORDER_NUMBER;

    private int index;
    private int orderNumber;
    private Customer customer;
    private Pizza[] pizzas = new Pizza[10];
    private String customerId;
    public int getPizzasQuinty;

    Order() {
        orderNumber = initialId++;
    }

    public void addPizza(String pizzaName, PizzaType type,
                         Ingredient[] ingredients, int quantity) {
        if (quantity > MAX_PIZZA_AMOUNT) {
            System.out.println("hop axper jan!!");
            return;
        }
        int pizzaIndex = index++;
        String validPizzaName = getValidPizzaName(pizzaName, pizzaIndex);
        pizzas[pizzaIndex] = new Pizza(validPizzaName, type, ingredients, quantity);
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double calculateOrderPrice() {
        double orderPrice = 0.0;
        for (Pizza pizza : pizzas) {
            if (pizza != null) {
                orderPrice += pizza.calculatePrice();
            }
        }
        return orderPrice;
    }

    public void printOrderAttributes() {
        for (Pizza pizza : pizzas) {
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
    public int getNumber() {
        return orderNumber;
    }
    public int getCustoerId() {
        return customer.getNumber();
    }
    public Pizza[] getPizzas() {
        return pizzas;
    }

    public String getCustomerId() {
        return customerId;
    }
}
