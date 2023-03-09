package homework_10.Karen_Sargsyan.pizza.myEnum;

import homework_10.Karen_Sargsyan.pizza.myInterface.ProductComponent;

public enum BarbecueMeatType implements ProductComponent {
    PIG_MEAT("Pig Meat", 7),
    CHICKEN_MEAT("Chicken Meat", 5),
    FISH_MEAT("Fish Meat", 6);
    private String name;
    private double price;

    BarbecueMeatType(String name, double price) {
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
