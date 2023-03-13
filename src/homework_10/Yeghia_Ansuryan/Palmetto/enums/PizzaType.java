package homework_10.Yeghia_Ansuryan.Palmetto.enums;

import homework_10.Yeghia_Ansuryan.Palmetto.product.component.ProductComponent;

public enum PizzaType implements ProductComponent {

    REGULAR("Regular", 1),

    CALZONE("Calzone", 1.5);

    private String name;
    private double price;

    PizzaType(String name, double price) {
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
