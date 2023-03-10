package homework_7.Anushik__Gevorgyan;

public class Ingredient {
    public static final Ingredient TOMATO_PASTE = new Ingredient("tomato paste", 1);
    public static final Ingredient CHEESE = new Ingredient("Cheese", 1);
    public static final Ingredient SALAMI = new Ingredient("Salami", 1.5);
    public static final Ingredient GARLIC = new Ingredient("Garlic", 0.3);
    public static final Ingredient BACON = new Ingredient("Bacon", 1.2);
    public static final Ingredient CORN = new Ingredient("Corn", 0.7);
    public static final Ingredient PEPERONI = new Ingredient("Peperoni", 0.6);
    public static final Ingredient OLIVES = new Ingredient("Olives", 0.5);

    public String getName() {
        return name;
    }

    private String name;
    private double price;

    public Ingredient(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {

        return price;
    }

}
