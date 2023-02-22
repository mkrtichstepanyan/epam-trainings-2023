package homework_7.Inesa_Mkrtchyan;

public class PizzaIngredient extends Ingredient {
    public static final PizzaIngredient TOMATO_PASTE = new PizzaIngredient("tomato paste", 1);
    public static final PizzaIngredient CHEESE = new PizzaIngredient("Cheese", 1);
    public static final PizzaIngredient SALAMI = new PizzaIngredient("Salami", 1.5);
    public static final PizzaIngredient BACON = new PizzaIngredient("Bacon", 1.2);
    public static final PizzaIngredient GARLIC = new PizzaIngredient("Garlic", 0.3);
    public static final PizzaIngredient CORN = new PizzaIngredient("Corn", 0.7);
    public static final PizzaIngredient PEPPERONI = new PizzaIngredient("Pepperoni",0.6);
    public static final PizzaIngredient OLIVES = new PizzaIngredient("Olives", 0.5);

    public PizzaIngredient(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}
