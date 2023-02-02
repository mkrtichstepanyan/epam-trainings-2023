package homework_5.Alina_Mkhoyan.pizza;

public class Ingredients {
    private final String name;
    private final double price;

    public Ingredients(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static Ingredients getTomatoPaste() {
        return new Ingredients("Tomato Paste", 1);
    }

    public static Ingredients getCheese() {
        return new Ingredients("Cheese", 1);
    }

    public static Ingredients getSalami() {
        return new Ingredients("Salami", 1.5);
    }

    public static Ingredients getBacon() {
        return new Ingredients("Bacon", 1.2);
    }

    public static Ingredients getGarlic() {
        return new Ingredients("Garlic", 0.3);
    }

    public static Ingredients getCorn() {
        return new Ingredients("Corn", 0.7);
    }

    public static Ingredients getPepperoni() {
        return new Ingredients("Pepperoni", 0.6);
    }

    public static Ingredients getOlives() {
        return new Ingredients("Olives", 0.5);
    }

}
