package homework_7.garik_gharibyan.fast_foot.foots.pizza;

public class Ingredient {
    private final String name;
    private final double price;

    private Ingredient(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static final Ingredient tomato_paste = new Ingredient("Tomato paste", 1);
    public static final Ingredient cheese = new Ingredient("Cheese", 1);
    public static final Ingredient salami = new Ingredient("Salami ", 1.5);
    public static final Ingredient bacon = new Ingredient("Bacon ", 1.2);
    public static final Ingredient garlic = new Ingredient("Garlic ", 0.3);
    public static final Ingredient peperoni = new Ingredient("Peperoni ", 0.6);
    public static final Ingredient corn = new Ingredient("Corn ", 0.7);
    public static final Ingredient olives = new Ingredient("Olives ", 0.5);
}
