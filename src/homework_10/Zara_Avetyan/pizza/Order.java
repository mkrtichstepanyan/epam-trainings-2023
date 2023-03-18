package homework_10.Zara_Avetyan.pizza;

public class Order {
    private static final int MAX_PIZZA_AMOUNT = 10;
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialId = BASE_ORDER_NUMBER;
    private int index;
    private int orderNumber;
    private Customer customer;
    private Pizza[] pizzas = new Pizza[10];

    Order() {
        orderNumber = initialId++;
    }

    public void addPizza(String pizzaName, PizzaType pizzaType,
                         Ingredient[] ingredients, int quantity) {
        if (quantity > MAX_PIZZA_AMOUNT) {
            throw new Quantity();
        } else {
            int pizzaIndex = index++;
            String validPizzaName = getValidPizzaName(pizzaName, pizzaIndex);
            pizzas[pizzaIndex] = new Pizza(validPizzaName, pizzaType, ingredients, quantity);
        }
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double calculateOrderPrice() {
        double price = 0.0;
        for (Pizza pizza : pizzas) {
            try {
                price += pizza.calculatePrice();
            }catch (NullPointerException e){
            }
        }
        return price;
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

    public Pizza[] getPizzas() {
        return pizzas;
    }

    public Customer getCustomer() {
        return customer;
    }
}
