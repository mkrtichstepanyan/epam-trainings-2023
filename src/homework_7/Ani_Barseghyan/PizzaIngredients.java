package homework_7.Ani_Barseghyan;

public class PizzaIngredients extends Ingredients {
    public static final PizzaIngredients TOMATO = new PizzaIngredients("Tomato", 1.0);
    public static final PizzaIngredients CHEESE = new PizzaIngredients("Cheese", 1.0);
    public static final PizzaIngredients SALAMI = new PizzaIngredients("Salami", 1.5);
    public static final PizzaIngredients BACON = new PizzaIngredients("Bacon", 1.2);
    public static final PizzaIngredients GARLIC = new PizzaIngredients("Garlic", 0.3);
    public static final PizzaIngredients CORN = new PizzaIngredients("Corn", 0.7);
    public static final PizzaIngredients PEPPERONI = new PizzaIngredients("Pepperoni", 0.6);
    public static final PizzaIngredients OLIVES = new PizzaIngredients("Olives", 0.5);


    public PizzaIngredients(String name, double price) {
        super(name, price);
    }
}
