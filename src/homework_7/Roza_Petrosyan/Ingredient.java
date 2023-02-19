package homework_7.Roza_Petrosyan;

public class Ingredient {
    public static final Ingredient TOMATO_PASTE = new Ingredient("Tomato paste", 1);
    public static final Ingredient CHEESE = new Ingredient("Cheese", 1);
    public static final Ingredient SALAMI = new Ingredient("Salami", 1.5);
    public static final Ingredient Bacon = new Ingredient("Bacon", 1.2);
    public static final Ingredient Garlic = new Ingredient("Garlic", 0.3);
    public static final Ingredient Corn = new Ingredient("Corn", 0.7);
    public static final Ingredient Pepperoni = new Ingredient("Pepperoni", 0.6);
    public static final Ingredient Olives = new Ingredient("Olives", 0.5);

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
