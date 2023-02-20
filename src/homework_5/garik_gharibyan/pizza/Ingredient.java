package homework_5.garik_gharibyan.pizza;

public class Ingredient {
    private String name;
    private double price;

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

    static final Ingredient tomato_paste = new Ingredient("Tomato paste", 1);
    static final Ingredient cheese = new Ingredient("Cheese", 1);
    static final Ingredient salami = new Ingredient("Salami ", 1.5);
    static final Ingredient bacon = new Ingredient("Bacon ", 1.2);
    static final Ingredient garlic = new Ingredient("Garlic ", 0.3);
    static final Ingredient peperoni = new Ingredient("Peperoni ", 0.6);
    static final Ingredient corn = new Ingredient("Corn ", 0.7);
    static final Ingredient olives = new Ingredient("Olives ", 0.5);
}
