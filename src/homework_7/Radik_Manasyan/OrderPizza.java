package homework_7.Radik_Manasyan;

public class OrderPizza{
    private static final int MAX_PIZZA_AMOUNT = 10;
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialId = BASE_ORDER_NUMBER;

    private static final Ingredient[] DEFAULT = {Ingredient.TOMATO_PASTE, Ingredient.CHEESE,
            Ingredient.SALAMI, Ingredient.BACON, Ingredient.GARLIC,
            Ingredient.CORN, Ingredient.PEPERONI, Ingredient.OLIVES};

    private int index;
    private int orderNumber;
    private Customer customer;
    private Pizza[] pizzas = new Pizza[10];

    OrderPizza() {
        orderNumber = initialId++;
    }


    public Pizza[] getPizzas() {
        return pizzas;
    }


    public void add(String pizzaName, PizzaType type,
                    Ingredient[] ingredients, int quantity) {
        if (quantity > MAX_PIZZA_AMOUNT) {
            System.out.println("hop axper jan!!");
            return;
        }
        int pizzaIndex = index++;
        String validPizzaName = getValidPizzaName(pizzaName, pizzaIndex);
        pizzas[pizzaIndex] = new Pizza(validPizzaName, type, ingredients, quantity);
    }

    public void add(String pizzaName, PizzaType type, int quantity) {
        if (quantity > MAX_PIZZA_AMOUNT) {
            System.out.println("hop axper jan!!");
            return;
        }
        int pizzaIndex = index++;
        String validPizzaName = getValidPizzaName(pizzaName, pizzaIndex);
        pizzas[pizzaIndex] = new Pizza(validPizzaName, type, DEFAULT, quantity);
    }


    public double calculateOrderPrice() {
        double totalCoast = 0.0;

        for (int i = 0; i < index; i++) {
            totalCoast += pizzas[i].calculatePrice() * pizzas[i].getQuantity();

        }
        return totalCoast;
    }


    public void printOrderAttributes() {
        for (int i = 0; i < index; i++) {
            System.out.println("[" + orderNumber + ": " + customer.getNumber() + ": " + pizzas[i].getName() + ": " + pizzas[i].getQuantity() + "]");
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getOrderNumber() {
        return orderNumber;
    }
}
