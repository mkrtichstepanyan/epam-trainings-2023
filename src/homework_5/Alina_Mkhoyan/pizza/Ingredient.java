package homework_5.Alina_Mkhoyan.pizza;

public enum Ingredient {
    Tomato_paste("Tomato paste", 1),
    Cheese("Cheese", 1),
    Salami("Salami", 1),
    Bacon("Bacon", 1.2),
    Garlic("Garlic", 0.3),
    Corn("Corn", 0.7),
    Pepperoni("Pepperoni", 0.6),
    Olives("Olives", 0.5);

    Ingredient(String name, double price) {
        this.name = name;
        this.price = price;
    }

    private final String name;
    private final double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}