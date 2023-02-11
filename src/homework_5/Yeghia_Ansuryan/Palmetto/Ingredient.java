package homework_5.Yeghia_Ansuryan.Palmetto;

public class Ingredient {
    private final String nameIngredient;
    private final double price;

    private Ingredient(String nameIngredient, double price){
        this.nameIngredient = nameIngredient;
        this.price = price;

    }

    public static Ingredient getTomatoPaste() {
        return new Ingredient("Tomato paste", 1.0);

    }

    public static Ingredient getCheese() {
        return new Ingredient("Cheese", 1.0);
    }

    public static Ingredient getSalami() {
        return new Ingredient("Salami", 1.5);
    }

    public static Ingredient getBacon() {
        return new Ingredient("Bacon", 1.2);
    }

    public static Ingredient getGarlic() {
        return new Ingredient("Garlic", 0.3);
    }

    public static Ingredient getCorn() {
        return new Ingredient("Corn", 0.7);
    }

    public static Ingredient getPepperoni() {
        return new Ingredient("Pepperoni", 0.6);
    }

    public static Ingredient getOlives() {
        return new Ingredient("Olives", 0.5);
    }

    public String getNameIngredient(){
        return nameIngredient;
    }

    public double getPrice(){
        return price;
    }


}
