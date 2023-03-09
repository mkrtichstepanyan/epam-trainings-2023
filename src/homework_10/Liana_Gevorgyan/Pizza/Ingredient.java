package homework_10.Liana_Gevorgyan.Pizza;

public class Ingredient {
    public static final Ingredient TOMATO_PASTE = new Ingredient("tomato paste", 1);
    public static final Ingredient CHEESE = new Ingredient("Cheese", 1);
    public static final Ingredient SALAMI = new Ingredient("Salami", 1.5);

    private String name;
    private double price;

    private Ingredient(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
