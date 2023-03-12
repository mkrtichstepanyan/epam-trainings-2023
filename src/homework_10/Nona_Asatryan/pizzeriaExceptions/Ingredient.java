package homework_10.Nona_Asatryan.pizzeriaExceptions;

public class Ingredient {
    public static final Ingredient TOMATO_PASTE = new Ingredient("Tomato Paste", 1);
    public static final Ingredient CHEESE = new Ingredient("Cheese", 1);
    public static final Ingredient SALAMI = new Ingredient("Salami", 1.5);
    public static final Ingredient BACON = new Ingredient("Bacon", 0.3);
    public static final Ingredient GARLIC = new Ingredient("Garlic", 1.5);
    public static final Ingredient CORN = new Ingredient("Corn", 0.7);
    public static final Ingredient PEPPERONI = new Ingredient("Pepperoni", 1.5);
    public static final Ingredient OLIVES = new Ingredient("Olives", 0.5);

    private String name;
    private double price;

    public Ingredient(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public  String getName () {
        return name;
    }
}
