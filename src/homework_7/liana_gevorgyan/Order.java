package homework_7.liana_gevorgyan;

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
        double totalPrice = 0.0;
        for (int i = 0; i < index; i++) {
            totalPrice = totalPrice + pizzas[i].calculatePrice() * pizzas[i].getQuantity();
        }

        return totalPrice;
    }


    public void printOrderAttributes() {
        for (int i= 0; i < index; i++ ) {
            System.out.println("[" + orderNumber + customer.getNumber() + pizzas[i].getName() + pizzas[i].getQuantity() + "]");
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

    public int getCustomerId() {
        return  customer.getNumber();
    }

    public int getPzzasQuty() {
        return index;
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }
}
