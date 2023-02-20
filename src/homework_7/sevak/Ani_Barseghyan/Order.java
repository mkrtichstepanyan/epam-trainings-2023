package homework_7.sevak.Ani_Barseghyan;

public class Order {
    private static final int MAX_PIZZA_AMOUNT = 10;
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialID = BASE_ORDER_NUMBER;
    private int pizzaIndex;
    private int beverageIndex;
    private int orderNumber;
    private Customer customer;
    private Pizza[] pizzas = new Pizza[10];
    private Beverages[] beverages = new Beverages[10];

    Order() {
        orderNumber = initialID++;
    }

    public void addPizza(String pizzaName, PizzaType type, Ingredients[] ingredients, int quantity) {
        if (quantity > MAX_PIZZA_AMOUNT) {
            System.out.println("Hop axper jan");
            return;
        }
        int index = pizzaIndex++;
        String validPizzaName = getValidPizzaName(pizzaName, pizzaIndex);
        pizzas[index] = new Pizza(validPizzaName, type, ingredients, quantity);
    }

    public void addPizza(Pizza pizza) {
        if (pizza.getQuantity() > MAX_PIZZA_AMOUNT) {
            System.out.println("Hop axper jan");
            return;
        }
        int index = pizzaIndex++;
        String validPizzaName = getValidPizzaName(pizza.getName(), pizzaIndex);
        Ingredients[] ing = pizza.getIngredients();
        pizzas[index] = new Pizza(validPizzaName, pizza.getPizzaType(), ing, pizza.getQuantity());
    }

    public void addBeverage(BeveragesMenu beverage, int quantity) {
        int index = beverageIndex++;
        beverages[index] = new Beverages(beverage, quantity);
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

    public Beverages[] getBeverages() {
        return beverages;
    }
}
