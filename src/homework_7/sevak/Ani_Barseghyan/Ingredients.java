package homework_7.sevak.Ani_Barseghyan;

public class Ingredients {
    public static final Ingredients TOMATO = new Ingredients("Tomato", 1.0);
    public static final Ingredients CHEESE = new Ingredients("Cheese", 1.0);
    public static final Ingredients SALAMI = new Ingredients("Salami", 1.5);
    public static final Ingredients BACON = new Ingredients("Bacon", 1.2);
    public static final Ingredients GARLIC = new Ingredients("Garlic", 0.3);
    public static final Ingredients CORN = new Ingredients("Corn", 0.7);
    public static final Ingredients PEPPERONI = new Ingredients("Pepperoni", 0.6);
    public static final Ingredients OLIVES = new Ingredients("Olives", 0.5);
    private String name;
    private double price;

    public Ingredients(String name, double price) {
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
