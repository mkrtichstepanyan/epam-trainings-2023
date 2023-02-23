package homework_7.sevak.Anushik__Gevorgyan;

public class Order {
    private static final int MAX_PIZZA_AMOUNT = 10;

    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialId = BASE_ORDER_NUMBER;

    private int orderNumber;
    private Customer customer;
    private int index;
    private Pizza[] pizzas = new Pizza[10];


    private int drinkIndex;


    Order() {

        orderNumber = initialId++;
    }

        public void addProduct(String productName, PizzaType type,
                           Ingredient[] ingredients, int quantity) {
        if (quantity > MAX_PIZZA_AMOUNT) {
            System.out.println("hop axper jan!!");
            return;
        }
        int pizzaIndex = index++;
        String validPizzaName = getValidPizzaName(productName, pizzaIndex);
        pizzas[pizzaIndex] = new Pizza(validPizzaName, type, ingredients, quantity);
    }

    public void addDrink(Product drink, int quantity) {
        if (drinkIndex > 20) {
            for (int i = 0; i < drinkIndex; i++) {
                if (pizzas[i] != null || pizzas[i] == drink) {
                    pizzas[i].setQuantity(pizzas[i].getQuantity() + quantity);
                    return;
                }
            }
            drink.setQuantity(quantity);



        } else {
            System.out.println("Hop axper jan!");
        }

    }

    public double calculateOrderPrice() {
        double price = 0.0;
        for (Pizza pizza: pizzas) {
            if (pizza != null) {
                price += pizza.calculatePrice();
            }
        }
        return price;
    }



    public int getOrderNumber() {
        return orderNumber;
    }


    public Pizza[] getProduct() {
        return pizzas;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getIndex() {
        return drinkIndex;
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
