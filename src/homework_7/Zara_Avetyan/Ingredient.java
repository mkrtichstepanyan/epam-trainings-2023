package homework_7.Zara_Avetyan;

public class Ingredient {
    public static final Ingredient TOMATO_PASTE = new Ingredient("tomato paste", 1);
    public static final Ingredient CHEESE = new Ingredient("cheese", 1);
    public static final Ingredient SALAMI = new Ingredient("salami", 1.5);
    public static final Ingredient BACON = new Ingredient("bacon", 1.2);
    public static final Ingredient GARLIC = new Ingredient("garlic", 0.3);
    public static final Ingredient CORN = new Ingredient("corn", 0.7);
    public static final Ingredient PEPPERONI = new Ingredient("pepperoni", 0.6);
    public static final Ingredient OLIVES = new Ingredient("olives", 0.5);
    private String name;
    private double price;

    Ingredient(String name, double price) {
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
