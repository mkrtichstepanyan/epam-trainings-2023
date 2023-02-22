package homework_7.Roza_Petrosyan.ingredient;

public class PizzaIngredient implements Ingredient{
    public static final PizzaIngredient TOMATO_PASTE = new PizzaIngredient("Tomato paste", 1);
    public static final PizzaIngredient CHEESE = new PizzaIngredient("Cheese", 1);
    public static final PizzaIngredient SALAMI = new PizzaIngredient("Salami", 1.5);
    public static final PizzaIngredient Bacon = new PizzaIngredient("Bacon", 1.2);
    public static final PizzaIngredient Garlic = new PizzaIngredient("Garlic", 0.3);
    public static final PizzaIngredient Corn = new PizzaIngredient("Corn", 0.7);
    public static final PizzaIngredient Pepperoni = new PizzaIngredient("Pepperoni", 0.6);
    public static final PizzaIngredient Olives = new PizzaIngredient("Olives", 0.5);

    private String name;
    private double price;

    public PizzaIngredient(String name, double price) {
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
