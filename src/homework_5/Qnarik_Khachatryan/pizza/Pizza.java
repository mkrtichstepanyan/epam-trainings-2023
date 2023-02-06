package homework_5.Qnarik_Khachatryan.pizza;

import java.util.Arrays;

enum IngredientType {
    TOMATO_PASTE,
    CHEESE,
    SALAMI,
    BACON,
    GARLIC,
    CORN,
    PEPPERONI,
    OLIVES,
};

enum PizzaType {
    REGULAR,
    CALZONE
}


public class Pizza {
    private String name;
    PizzaType type;   //regular and Calzone
    IngredientType[] listOfIngredients; //max 7
    private int ingredientIndex = 0;
    double price = 0;
    double total = 0;
    int ingredientsCountInPizza = 0;
    int pizzasQuantity;


    Pizza(String name, PizzaType type) {
        this.name = name;
        this.type = type;
        this.listOfIngredients = new IngredientType[7];
        this.pizzasQuantity = 0;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addIngredient(IngredientType ingredient) {
        if (Arrays.stream(listOfIngredients).anyMatch(item -> item == ingredient)) {
            System.out.println("Duplicate ingredient");
            return;
        }
        if (ingredientIndex == 7) {
            System.out.println("Max ingredients");
            return;
        }

        listOfIngredients[ingredientIndex] = ingredient;
        ingredientIndex++;
        ingredientsCountInPizza += 1;

    }

    public double calculatePrice() {
            for (int i = 0; i < ingredientsCountInPizza; i++) {
                IngredientType ingredient = listOfIngredients[i];
                switch (ingredient) {
                    case TOMATO_PASTE:
                        price = 1;
                        break;
                    case CHEESE:
                        price = 1;
                        break;
                    case SALAMI:
                        price = 1.5;
                        break;
                    case BACON:
                        price = 1.2;
                        break;
                    case GARLIC:
                        price = 0.3;
                        break;
                    case CORN:
                        price = 0.7;
                        break;
                    case PEPPERONI:
                        price = 0.6;
                        break;
                    case OLIVES:
                        price = 0.5;
                        break;
                }
                total += price;
        }
        return total;
    }

    public double getIngredientPrice(IngredientType ingredient){
        switch (ingredient) {
            case TOMATO_PASTE:
                price = 1;
                break;
            case CHEESE:
                price = 1;
                break;
            case SALAMI:
                price = 1.5;
                break;
            case BACON:
                price = 1.2;
                break;
            case GARLIC:
                price = 0.3;
                break;
            case CORN:
                price = 0.7;
                break;
            case PEPPERONI:
                price = 0.6;
                break;
            case OLIVES:
                price = 0.5;
                break;
        }
        return price;

    }


    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", listOfIngredients=" + Arrays.toString(listOfIngredients) +
                '}';
    }
}
