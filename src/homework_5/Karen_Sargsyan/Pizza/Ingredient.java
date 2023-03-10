package homework_5.Karen_Sargsyan.Pizza;

import java.util.Objects;

public class Ingredient {
    private final String nameOfIngredient;
    private final double price;

    private Ingredient(String nameOfIngredient, double price) {
        this.nameOfIngredient = nameOfIngredient;
        this.price = price;
    }

    public static Ingredient getTomatoPaste() {
        return new Ingredient("Tomato Paste", 1.0);
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

    public String getNameOfIngredient() {
        return nameOfIngredient;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ingredient that = (Ingredient) o;
        return Double.compare(that.price, price) == 0 && Objects.equals(nameOfIngredient, that.nameOfIngredient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfIngredient, price);
    }

    @Override
    public String toString() {
        return nameOfIngredient + " " + price;
    }

}
