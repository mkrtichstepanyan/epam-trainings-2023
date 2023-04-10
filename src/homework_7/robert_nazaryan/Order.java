package homework_7.robert_nazaryan;

public class Order {
    private static final int MAX_PIZZA_AMOUNT = 10;
    private static final int MAX_DRINK_AMOUNT = 3;
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialId = BASE_ORDER_NUMBER;

    private int index;
    private int drinkIndex = 0;
    private int orderNumber;
    private Customer customer;
    private Drink[] drinks = new Drink[MAX_DRINK_AMOUNT];
    private Pizza[] pizzas = new Pizza[MAX_PIZZA_AMOUNT];

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

    public void addDrink(Drink drink, int quantity) {
        drinks[drinkIndex] = drink;
        drinks[drinkIndex].quantity = quantity;
        drinkIndex++;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double calculateOrderPrice() {
        double price = 0.0;
        for (Pizza pizza : pizzas) {
            if (pizza != null) {
                price += pizza.calculatePrice();
            }
        }
        for (Drink drink : drinks) {
            if (drink != null) {
                price += drink.price * drink.quantity;
            }
        }
        return price;
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }

    public Drink[] getDrinks() {
        return drinks;
    }

    public void printOrderAttributes() {
        for (Pizza pizza : pizzas) {
            if (pizza != null) {
                System.out.println("[" + orderNumber + ": " + customer.getNumber() + ": " + pizza.getName()
                        + ": " + pizza.getQuantity() + "]");
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
}
