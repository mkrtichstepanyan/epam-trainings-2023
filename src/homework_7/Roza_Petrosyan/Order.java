package homework_7.Roza_Petrosyan;

public class Order extends OrderedItems {
    private static final int MAX_PIZZA_AMOUNT = 10;
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialId = BASE_ORDER_NUMBER;

    private int index;
    private int index2;
    private int orderNumber;
    private Customer customer;

    Order() {
        orderNumber = initialId++;
    }

    public void addPizza(String pizzaName, PizzaType type,
                         Ingredient[] ingredients, int quantity) {
        if (quantity > MAX_PIZZA_AMOUNT) {
            System.out.println("You can not order more than 10 pizzas!");
            return;
        }
        int pizzaIndex = index++;
        String validPizzaName = getValidPizzaName(pizzaName, pizzaIndex);
        getPizzas()[pizzaIndex] = new Pizza(validPizzaName, type, ingredients, quantity);
    }

    public void addDrink(String drinkName, DrinkType type, int quantity) {
        int drinkIndex = index2++;
        getDrinks()[drinkIndex] = new Drink(drinkName, type, quantity);
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double calculateOrderPrice() {

        // todo calculate order total price
        double totalPrice = 0;
        for (Pizza pizza : getPizzas()) {
            if (pizza != null) {
                if (!pizza.isDuplicate(pizza.getIngredients()) && pizza.getMaxCount() < 7) {
                    totalPrice += pizza.calculatePrice() * pizza.getQuantity();
                }
            }
        }
        for (Drink drink : getDrinks()) {
            if (drink != null) {
                totalPrice += drink.calculatePrice() * drink.getQuantity();
            }
        }
        return totalPrice;
    }


    public void printOrderAttributes() {
        for (Pizza pizza : getPizzas()) {
            if (pizza != null) {
                System.out.println("[" + orderNumber + ":"
                        + customer.getNumber() + ":"
                        + pizza.getName() + ":"
                        + pizza.getQuantity() + "]");
            }
        }
        for (Drink drink : getDrinks()) {
            if (drink != null) {
                System.out.println("[" + orderNumber + ":"
                        + customer.getNumber()
                        + ":" + drink.getName()
                        + ":" + drink.getQuantity() + "]");
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
