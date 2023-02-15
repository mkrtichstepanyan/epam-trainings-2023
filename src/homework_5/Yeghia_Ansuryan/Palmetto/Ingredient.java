package homework_5.Yeghia_Ansuryan.Palmetto;

import java.util.Objects;

public class Ingredient {
    private final String ingredientName;
    private final double ingredientPrice;

    private Ingredient(String ingredientName, double ingredientPrice) {
        this.ingredientName = ingredientName;
        this.ingredientPrice = ingredientPrice;
    }

    public static Ingredient tomatoPaste() {
        return new Ingredient("Tomato paste", 1.0);
    }

    public static Ingredient cheese() {
        return new Ingredient("Cheese", 1.0);
    }

    public static Ingredient salami() {
        return new Ingredient("Salami", 1.5);
    }

    public static Ingredient bacon() {
        return new Ingredient("Bacon", 1.2);
    }

    public static Ingredient garlic() {
        return new Ingredient("Garlic", 0.3);
    }

    public static Ingredient corn() {
        return new Ingredient("Corn", 0.7);
    }

    public static Ingredient pepperoni() {
        return new Ingredient("Pepperoni", 0.6);
    }

    public static Ingredient olives() {
        return new Ingredient("Olives", 0.5);
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public double getIngredientPrice() {
        return ingredientPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return Double.compare(that.ingredientPrice, ingredientPrice) == 0 && Objects.equals(ingredientName, that.ingredientName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingredientName, ingredientPrice);
    }

    @Override
    public String toString() {
        return ingredientName + " " + ingredientPrice;
    }
}
