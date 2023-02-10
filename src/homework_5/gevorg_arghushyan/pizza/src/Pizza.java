package homework_5.gevorg_arghushyan.pizza.src;

import java.util.*;

class Pizza {
    private static int counter = 100000;
    private int orderNumber;
    private String name;
    private String type;
    private List<String> ingredients;
    private int quantity;
    private double price;

    public Pizza(String name, String type, List<String> ingredients, int quantity) {
        this.orderNumber = counter++;
        this.name = name;
        this.type = type;
        this.ingredients = ingredients;
        this.price = calculatePrice(ingredients);
        this.quantity = quantity;
    }

    public Pizza() {
    }

    public int getQuantity() {
        return quantity;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Set<String> getIngredients() {
        Set<String> hashSet = new HashSet<>();
        for (String ingredient : ingredients) {
            hashSet.add(ingredient);
        }

        return hashSet;
    }

    public double getPrice() {
        return price;
    }

    private double calculatePrice(List<String> ingredients) {

        double price = 1;
        for (String ingredient : ingredients) {

            switch (ingredient) {
                case "Tomato paste":
                    // price += 1;
                    // break;
                case "Cheese":
                    price += 1;
                    break;
                case "Salami":
                    price += 1.5;
                    break;
                case "Bacon":
                    price += 1.2;
                    break;
                case "Garlic":
                    price += 0.3;
                    break;
                case "Corn":
                    price += 0.7;
                    break;
                case "Pepperoni":
                    price += 0.6;
                    break;
                case "Olives":
                    price += 0.5;
            }
        }
        return price;
    }
}
