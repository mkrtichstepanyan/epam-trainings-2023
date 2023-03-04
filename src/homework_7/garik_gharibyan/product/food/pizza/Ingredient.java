package homework_7.garik_gharibyan.product.food.pizza;

public enum Ingredient {

    BACON("Bacon ", 1.2),

    GARLIC("Garlic ", 0.3),

    PEPERONI("Peperoni ", 0.6),

    CORN("Corn ", 0.7),

    OLIVES("Olives ", 0.5),

    TOMATO_PASTE("Tomato paste", 1),

    CHEESE("Cheese", 1),

    SALAMI("Salami ", 1.5);

    final String name;
    final double price;

    Ingredient(String name, double price) {
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
