package homework_5.Ofelya_Khachatryan.pizza;

import java.time.LocalTime;

public class PlaceOrderService {

    private static final Ingredient[] INGREDIENTS;
    private static final String PIZZA_MARGARITA = "Margarita";
    private static final int DEFAULT_PIZZA_PRICE = 1;

    static {
        INGREDIENTS = new Ingredient[]{
                new Ingredient("Tomato paste", 1),
                new Ingredient("Cheese", 1),
                new Ingredient("Salami", 1.5),
                new Ingredient("Bacon", 1.2),
                new Ingredient("Garlic", 0.3),
                new Ingredient("Corn", 0.7),
                new Ingredient("Pepperoni", 0.6),
                new Ingredient("Olives", 0.5),
        };
    }

    private PlaceOrder[] placeOrders = new PlaceOrder[10];
    private int index;
    private int orderNumber = 10000;

    public void createOrder(final int customerNumber,
                            final Pizza[] pizzas) {
        if (!isValidPizzaLength(pizzas)) {
            return;
        }
        validateAndChangePizzaName(pizzas, customerNumber, index);
        PlaceOrder placeOrder = new PlaceOrder(orderNumber++, customerNumber, pizzas, LocalTime.now());
        placeOrders[index++] = placeOrder;
        printCheck(placeOrder);
    }

    public boolean addIngredients(Ingredient[] requestIngredients, Pizza pizza) {
        Ingredient[] finalIngredients = new Ingredient[4 + requestIngredients.length];
        Ingredient[] defaultIngredients;
        if (pizza.getName().equals(PIZZA_MARGARITA)) {
            defaultIngredients = getMargaritaIngredients();
        } else {
            defaultIngredients = getOtherPizzasIngredients();
        }
        for (int i = 0; i < defaultIngredients.length; i++) {
            finalIngredients[i] = defaultIngredients[i];
        }
        for (int i = defaultIngredients.length, requestIndex = 0; i < finalIngredients.length; i++, requestIndex++) {
            finalIngredients[i] = requestIngredients[requestIndex];
        }
        pizza.setIngredients(finalIngredients);
        return isValidIngredients(pizza);
    }

    public void printPizzaAttributes() {
        for (int i = 0; i < index; i++) {
            PlaceOrder placeOrder = placeOrders[i];
            String commonStr = "[" + placeOrder.getOrderNumber() +
                    ":" + placeOrder.getCustomerNumber();
            for (Pizza pizza : placeOrder.getPizzas()) {
                String result = commonStr + ":" + pizza.getName() + ":" + pizza.getQuantity() + "]";
                System.out.println(result);
            }
        }
    }

    public void printCheck() {
        for (PlaceOrder placeOrder : placeOrders) {
            printCheck(placeOrder);
        }
    }

    private void printCheck(PlaceOrder placeOrder) {
        double totalAmount = 0;
        System.out.println("**********************************************");
        System.out.println("Order: " + placeOrder.getOrderNumber());
        System.out.println("Client: " + placeOrder.getCustomerNumber());

        for (Pizza pizza : placeOrder.getPizzas()) {
            System.out.println("Name: " + pizza.getName());
            System.out.println("---------------------");
            double ingredientsAmount = 0;
            for (Ingredient ingredient : pizza.getIngredients()) {
                System.out.println(ingredient.getName() + " " + ingredient.getPrice() + "€");
                ingredientsAmount += ingredient.getPrice();
            }
            System.out.println("---------------------");
            double amount = DEFAULT_PIZZA_PRICE + pizza.getPizzaType().getPrice() + ingredientsAmount;
            totalAmount += (amount * pizza.getQuantity());
            System.out.println("Amount: " + amount + "€");
            System.out.println("Quantity: " + pizza.getQuantity());
            System.out.println("---------------------");

        }
        System.out.println("---------------------");
        System.out.println("Total Amount: " + totalAmount + "€");
        System.out.println("**********************************************");
    }

    private boolean isValidPizzaLength(Pizza[] pizzas) {
        if (pizzas.length > 10) {
            System.out.println("count of the pizzas must not be greater then 10");
            return false;
        }
        return true;
    }

    private void validateAndChangePizzaName(Pizza[] pizzas, int customerNumber, int index) {
        for (Pizza pizza : pizzas) {
            if (pizza.getName().length() < 4 || pizza.getName().length() > 20) {
                pizza.setName(customerNumber + "_" + index);
            }
        }
    }

    private boolean isValidIngredients(Pizza pizza) {
        Ingredient[] ingredients = pizza.getIngredients();
        if (ingredients.length > 7) {
            System.out.println("count of the ingredients must not be greater then 7");
            return false;
        }
        for (int i = 0; i < ingredients.length; i++) {
            for (int j = i + 1; j < ingredients.length; j++) {
                if (ingredients[i].equals(ingredients[j])) {
                    System.out.println("ingredients must not be duplicated");
                    return false;
                }
            }
        }
        return true;
    }

    private Ingredient[] getMargaritaIngredients() {
        return new Ingredient[]{
                getIngredientByName("Tomato paste"),
                getIngredientByName("Pepperoni"),
                getIngredientByName("Garlic"),
                getIngredientByName("Bacon")
        };
    }

    private Ingredient[] getOtherPizzasIngredients() {
        return new Ingredient[]{
                getIngredientByName("Tomato paste"),
                getIngredientByName("Cheese"),
                getIngredientByName("Salami"),
                getIngredientByName("Olives")
        };
    }

    public Ingredient getIngredientByName(String name) {
        for (Ingredient ingredient : INGREDIENTS) {
            if (ingredient.getName().equals(name)) {
                return ingredient;
            }
        }
        return null;
    }
}
