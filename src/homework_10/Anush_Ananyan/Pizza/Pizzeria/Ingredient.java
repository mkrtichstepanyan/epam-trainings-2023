package homework_10.Anush_Ananyan.Pizza.Pizzeria;

enum Ingredient {
    TOMATO_PASTE("tomato paste", 1),

    CHEESE("Cheese", 1),

    SALAMI("Salami", 1.5),

    BACON("Bacon", 1.2),

    GARLIC("Garlic", 0.3),

    CORN("Corn", 0.7),

    PEPPERONI("Pepperoni", 0.6),

    OLIVES("Olives", 0.5);


    private String name;
    private double price;

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
