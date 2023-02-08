package homework_5.Anna_Manukyan.Pizzeria;

public enum Ingredient {
    TOMATO_PASTE(1, "Tomato paste"),
    CHEESE(1, "Cheese"),
    SALAMI(1.5, "Salami"),
    BACON(1.2, "Bacon"),
    GARLIC(0.3, "Garlic"),
    CORN(0.7, "Corn"),
    PEPERONI(0.6, "Pepperoni"),
    OLIVES(0.5, "Olives");

    private double price;
    private String name;

    Ingredient(double price, String name) {
        this.price = price;
        this.name = name;
    }

    double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
