package homework_7.Radik_Manasyan.orders;

import homework_7.Radik_Manasyan.products.Ingredient;
import homework_7.Radik_Manasyan.products.Pizza;
import homework_7.Radik_Manasyan.products.productType.ProductType;

public class OrderPizza extends Order {
    private static final int MAX_PIZZA_AMOUNT = 10;
    private static final Ingredient[] DEFAULT = {Ingredient.TOMATO_PASTE, Ingredient.CHEESE,
            Ingredient.SALAMI, Ingredient.BACON, Ingredient.GARLIC,
            Ingredient.CORN, Ingredient.PEPERONI, Ingredient.OLIVES};


    public OrderPizza() {
        setOrderNumber(getInitialId() + 1);
        setInitialId(getOrderNumber());
    }

    public void add(String pizzaName, ProductType type,
                    Ingredient[] ingredients, int quantity) {
        if (quantity > MAX_PIZZA_AMOUNT) {
            System.out.println("hop axper jan!!");
            return;
        }

        int pizzaIndex = getIndex();
        setIndex(pizzaIndex++);
        String validPizzaName = getValidPizzaName(pizzaName, pizzaIndex);
        Pizza pizza = new Pizza(validPizzaName, type, ingredients, quantity);
        addOrderByProducts(pizza);

    }

    public void add(String pizzaName, ProductType type, int quantity) {
        if (quantity > MAX_PIZZA_AMOUNT) {
            System.out.println("hop axper jan!!");
            return;
        }

        int pizzaIndex = getIndex();
        setIndex(pizzaIndex++);
        String validPizzaName = getValidPizzaName(pizzaName, pizzaIndex);
        Pizza pizza = new Pizza(validPizzaName, type, DEFAULT, quantity);
        addOrderByProducts(pizza);
    }


    public double calculateOrderPrice() {
        double totalCoast = 0.0;
        for (int i = 0; i < getIndex(); i++) {
            totalCoast += products[i].calculatePrice() * products[i].getQuantity();

        }
        return totalCoast;
    }

    private String getValidPizzaName(String pizzaName, int pizzaIndex) {
        String validPizzaName = pizzaName;
        if (!isValidPizzaName(pizzaName)) {
            validPizzaName = getCustomer().getName() + "_" + pizzaIndex;
        }
        return validPizzaName;
    }


    private boolean isValidPizzaName(String pizzaName) {
        return pizzaName != null && pizzaName.length() > 4 && pizzaName.length() < 20;
    }

}
