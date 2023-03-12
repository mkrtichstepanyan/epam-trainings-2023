package homework_10.Karen_Sargsyan.pizza.pizzaEnum;

import homework_10.Karen_Sargsyan.pizza.productInterface.ProductComponent;

public enum PizzaType implements ProductComponent {

    REGULAR("Regular", 1),
    CALZONE("Calzone", 1.5);
    private String name;
    private double price;

    PizzaType(String name, double basePrice) {
        this.name = name;
        this.price = basePrice;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
