package homework_7.TatevKocharyan;

public class Order {
    private static final int MAX_PIZZA_AMOUNT = 10;
    private static final int BASE_ORDER_NUMBER = 1000;
    private static int initialId = BASE_ORDER_NUMBER;
    private int index;
    private int orderNumber;
    private Customer customer;
    private Pizza[] pizzas = new Pizza[MAX_PIZZA_AMOUNT];


    Order() {
        orderNumber = initialId++;
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

    public void addPizza(String pizzaName, PizzaType calzone, Ingredient[] ingredients, int quantity) {
        if (quantity > MAX_PIZZA_AMOUNT) {
            System.out.println("You can't order more than 10 ");
            return;
        }
        int pizzaIndex = index++;
        String validName = getValidPizzaName(pizzaName, pizzaIndex);
        pizzas[pizzaIndex] = new Pizza(pizzaName, calzone, ingredients, quantity);

    }

    private String getValidPizzaName(String pizzaName, int pizzaIndex) {
        String validPizzaName = pizzaName;
        if (!isValidPizzaName(pizzaName)) {
            validPizzaName = customer.getCustomerName() + " " + pizzaIndex;
        }
        return validPizzaName;
    }

    private boolean isValidPizzaName(String pizzaName) {
        return pizzaName != null && pizzaName.length() > 4 && pizzaName.length() < 20;
    }

    public void setCusomer(Customer customer) {
        this.customer = customer;
    }


    public double calculateOrderPrice(Order order) {
        double calculateOrderPrice = 0.0;
        Pizza[] pizzas = order.pizzas;
        for (int i = 0; i < pizzas.length; i++) {
            if (pizzas[i] != null) {
                Ingredient[] ingredients = pizzas[i].getIngredients();
                for (int j = 0; j < ingredients.length; j++) {
                    calculateOrderPrice = calculateOrderPrice + ingredients[j].getPrice();
                }
                calculateOrderPrice += pizzas[i].getPizzaType().getPrice();
                // calculateOrderPrice*=pizzas[i].getQuantity();
            }
        }
        return calculateOrderPrice;
        // todo calculate order total price+
    }

    public void printOrderAttributes() {
        for (Pizza pizza : pizzas) {
            System.out.println("[" + orderNumber + customer.getCustomerNumber() + pizza.getName() + pizza.getQuantity() + "]");

        }
    }
}
