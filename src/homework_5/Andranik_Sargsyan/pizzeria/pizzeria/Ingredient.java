package homework_5.Andranik_Sargsyan.pizzeria.pizzeria;

public class Ingredient {

    private final String name;
    private final double price;
    private OrderItem[] orderItems;


    public Ingredient(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static Ingredient getTomatoPaste() {
        return new Ingredient("Tomato Paste", 1);
    }

    public static Ingredient getCheese() {
        return new Ingredient("Cheese", 1);
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

    public String toString() {
        return name + " - " + price + " $";
    }
}