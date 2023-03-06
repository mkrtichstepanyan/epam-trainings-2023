package homework_10.Inesa_Mkrtchyan.Pizza;

public class SoupIngredient extends Ingredient {
    public static final SoupIngredient TOMATOES = new SoupIngredient("Tomatoes", 1);
    public static final SoupIngredient POTATOES = new SoupIngredient("Potatoes", 2.3);
    public static final SoupIngredient CARROTS = new SoupIngredient("Carrots", 1.5);
    public static final SoupIngredient MEAT = new SoupIngredient("Meat", 3.2);
    public SoupIngredient(String name, double price){
        this.name = name;
        this.price = price;
    }
}
