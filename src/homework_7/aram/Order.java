package homework_7.aram;



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
        // todo calculate order total price
        double total = 0.0;
        for (Pizza pizza : pizzas) {
            if (pizza != null) {
                total += pizza.calculatePrice() * pizza.getQuantity();
            }

        }

        return total;
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

    public void setOrderNumber(int orderNumber) throws OrderNumberException {
        if(orderNumber<10000){
            throw new OrderNumberException();
        }
        this.orderNumber = orderNumber;
    }

    public int getOrderNumber() {
        return orderNumber;
    }


    public Pizza[] getPizzas() {
        Pizza[] temp = new Pizza[index];
        for (int i = 0; i < index; i++) {
            temp[i] = pizzas[i];
        }
        return temp;
    }

    public String getCustomerName() {
        return customer.getName();
    }
}
