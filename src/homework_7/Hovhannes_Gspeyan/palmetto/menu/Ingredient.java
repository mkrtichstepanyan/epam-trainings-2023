package homework_7.Hovhannes_Gspeyan.palmetto.menu;

public enum Ingredient {

    TOMATO_PASTE(1),
    CHEESE(1),
    SALAMI(1.5),
    BACON(1.2),
    GARLIC(0.3),
    CORN(0.7),
    PEPPERONI(0.6),
    OLIVES(0.5);


    private double price;

    Ingredient() {

    }

    Ingredient(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
