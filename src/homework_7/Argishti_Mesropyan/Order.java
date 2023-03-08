package homework_7.Argishti_Mesropyan;

public class Order {
    private static final int MAX_PIZZA_AMOUNT = 10;
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialId = BASE_ORDER_NUMBER;

    private int index;

    private int orderNumber;
    private Customer customer;
    private Pizza[] pizzas = new Pizza[MAX_PIZZA_AMOUNT];


    private String pizzaName;

    Order() {
        orderNumber = initialId++;
    }

    public void addPizza(String pizzaName, PizzaType type, Ingredient[] ingredients, int quantity) {
        if (quantity > MAX_PIZZA_AMOUNT) {
            System.out.println("hop axper jan!!!");
            return;
        }
        int pizzaIndex = index++;
        String validPizzaName;
        if (pizzaName != null && pizzaName.length() > 4 && pizzaName.length() < 20) {
            validPizzaName = pizzaName;
        } else {
            validPizzaName = customer.getName() + "_" + pizzaIndex;
        }
        pizzas[pizzaIndex] = new Pizza(validPizzaName, type, ingredients, quantity);
    }



    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double calculateOrderPrice(){
        double orderPrice = 0.0;
        for(Pizza pizza : pizzas){
            if(pizza != null){
                orderPrice +=pizza.calculatePrice();
            }
        }
        // todo calculate order total  price.

        return orderPrice;
    }
    public void printOrderAttributes() {
        for (int i = 0; i < pizzas.length; i++) {
            Pizza pizza = pizzas[i];
            System.out.println("[" + orderNumber + customer.getNumber()
                    + pizza.getName() + pizza.getQuantity() + "]");

        }
    }
}
