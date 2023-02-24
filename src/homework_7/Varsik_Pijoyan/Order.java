package homework_7.Varsik_Pijoyan;

public class Order {
    private static final int MAX_PIZZA_AMOUNT = 10;
    private static final int MAX_DRINK_AMOUNT = 3;
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialId = BASE_ORDER_NUMBER;


    private int indexForPizza;
    private int indexForDrink;
    private int orderNumber;
    private Customer customer;
    private Pizza[] pizzas = new Pizza[10];
    private Drink[] drinks = new Drink[3];


    Order() {
        orderNumber = initialId++;
    }

    public void addPizza(String pizzaName, PizzaType type, Ingredient[] ingredients, int quantity) {
        if (quantity > MAX_PIZZA_AMOUNT) {
            System.out.println("hop axper jan!!");
            return;
        }
        int pizzaIndex = indexForPizza++;
        String validPizzaName = getValidPizzaName(pizzaName, pizzaIndex);
        pizzas[pizzaIndex] = new Pizza(validPizzaName, type, ingredients, quantity);
    }

    public void addDrink(DrinkType drinkType, String drinkName, int quantity) {
        if (quantity > MAX_DRINK_AMOUNT) {
            System.out.println("hop axper jan!!");
            return;
        }
        int drinkIndex = indexForDrink++;
        String validDrinkName = getValidDrinkName(drinkName, drinkIndex);
        drinks[drinkIndex] = new Drink(validDrinkName, drinkType, quantity);

    }



    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double calculateOrderPrice() {
        // todo calculate order total price
        double price = 0.0;
        for (Pizza pizza : pizzas) {
            if(pizza != null){
                price += pizza.calculatePrice();
            }
        }
        for (Drink drink : drinks) {
            if (drink != null) {
                price += drink.calculatePrice();
            }
        }

        return price;
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

    private String getValidDrinkName(String drinkName, int drinkIndex) {
        String validDrinkName = drinkName;
        if (!isValidDrinkName(drinkName)) {
            validDrinkName = customer.getName() + "_" + drinkIndex;
        }
        return validDrinkName;
    }

    private boolean isValidPizzaName(String pizzaName) {
        return pizzaName != null && pizzaName.length() > 4 && pizzaName.length() < 20;
    }

    private boolean isValidDrinkName(String drinkName) {
        return drinkName != null && drinkName.length() > 4 && drinkName.length() < 20;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
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
}
