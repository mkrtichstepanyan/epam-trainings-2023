package homework_7.Argishti_Mesropyan;

public class Ingredient {

    public static final Ingredient TOMATO_PASTE = new Ingredient("tomato paste", 1);
    public static final Ingredient CHEESE = new Ingredient("Cheese", 1);
    public static final Ingredient SALAMI = new Ingredient("Salami", 1.5);
    public static final Ingredient OLIVES = new Ingredient("Salami", 2.0);
    public static final Ingredient BACON = new Ingredient("Salami", 0.5);
    public static final Ingredient PEPPERONI = new Ingredient("Salami", 2.5);


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
