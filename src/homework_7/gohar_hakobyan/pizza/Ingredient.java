package homework_7.gohar_hakobyan.pizza;

public class Ingredient {
    public static final Ingredient TOMATO_PASTE = new Ingredient("tomato paste", 1);
    public static final Ingredient CHEESE = new Ingredient("Cheese", 1);
    public static final Ingredient SALAMI = new Ingredient("Salami", 1.5);
    public static final Ingredient BACON = new Ingredient("BACON", 0.3);
    public static final Ingredient GARLIC = new Ingredient("GARLIC", 1.5);
    public static final Ingredient CORN = new Ingredient("CORN", 0.7);
    public static final Ingredient PEPPERONI = new Ingredient("PEPPERONI", 1.5);
    public static final Ingredient OLIVES = new Ingredient("OLIVES", 0.5);

    private String name;
    private double price;

    public Ingredient(String name, double price) {
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
