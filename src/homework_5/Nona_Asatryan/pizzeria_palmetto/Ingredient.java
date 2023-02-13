package homework_5.Nona_Asatryan.pizzeria_palmetto;

public enum Ingredient {

    TOMATO_PASTE("Tomato paste", 1),
    CHEESE("Cheese", 1),
    SALAMI("Salami", 1.5),
    BACON("Bacon", 1.2),
    GARLIC("Garlic", 0.3),
    CORN("Corn", 0.7),
    PEPERONI("Pepperoni", 0.6),
    OLIVES("Olives", 0.5);


    private final String name;
    private final double price;

    Ingredient(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }
}
