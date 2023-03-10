package homework_9.Karen_Sargsyan.pizza.barbecueEnum;

import homework_9.Karen_Sargsyan.pizza.myInterface.ProductComponent;

public enum IngredientBarbecue implements ProductComponent {
    BREAD("Bread", 0.8),
    ONION("Onion", 0.7),
    TOMATO_PASTE("Tomato Paste", 1);

    private String name;
    private double price;

    IngredientBarbecue(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
