package homework_7.Qnarik_Khachatryan;

public class Order {
    private static final int MAX_PIZZA_AMOUNT = 10;
    private static final int MAX_DRINK_AMOUNT = 5;
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialId = BASE_ORDER_NUMBER;

    private int startPizzaIndex;
    private int startDrinkIndex;
    private int orderNumber;
    private Customer customer;
    private Pizza[] pizzas = new Pizza[MAX_PIZZA_AMOUNT];
    private Drink[] drinks = new Drink[MAX_DRINK_AMOUNT];

    Order() {
        orderNumber = initialId++;
    }

    public void addPizza(String pizzaName, PizzaType type,
                         Ingredient[] ingredients, int quantity) {
        if (quantity > MAX_PIZZA_AMOUNT) {
            System.out.println("hop axper jan!!");
            return;
        }
        int pizzaIndex = startPizzaIndex++;
        String validPizzaName = getValidPizzaName(pizzaName, pizzaIndex);
        pizzas[pizzaIndex] = new Pizza(validPizzaName, type, ingredients, quantity);
    }

    public void addDrink(DrinkType drinkType, String drinkName, int quantity) {
        int drinkIndex = startDrinkIndex++;
        drinks[drinkIndex] = new Drink(drinkType, drinkName, quantity);

    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }

    public Drink[] getDrinks() {
        return drinks;
    }

    public double calculateOrderPrice() {
        double orderPrice = 0.0;
        for (Pizza pizza : pizzas) {
            if (pizza != null) {
                orderPrice += pizza.calculatePrice() * pizza.getQuantity();
            }
        }
        for (Drink drink : drinks) {
            if (drink != null) {
                orderPrice += drink.calculatePrice() * drink.getQuantity();
            }
        }
        return orderPrice;
    }


    public void printOrderAttributes() {
        for (Pizza pizza : pizzas) {
            System.out.println("[" + orderNumber + customer.getNumber() + pizza.getName() + pizza.getQuantity() + "]");
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
}
