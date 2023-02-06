package homework_5.Hovhannes_Abrahamyan;

public class Ingredient {

    private final String name;
    private final double price;

    public Ingredient(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
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

    public static Ingredient GetSalami() {
        return new Ingredient("Salami", 1.5);
    }

    public static Ingredient GetBacon() {
        return new Ingredient("Becon", 1.2);
    }

    public static Ingredient GetGarlic() {
        return new Ingredient("garlic", 0.3);
    }

    public static Ingredient GetCorn() {
        return new Ingredient("corn", 0.7);
    }

    public static Ingredient GetOlives() {
        return new Ingredient("Olives", 0.5);
    }
}