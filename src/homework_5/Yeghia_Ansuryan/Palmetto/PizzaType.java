package homework_5.Yeghia_Ansuryan.Palmetto;

public class PizzaType {
    private final String nameOfPizzaType;
    private final double priceOfPizzaType;

    private PizzaType(String name, double price) {
        this.nameOfPizzaType = name;
        this.priceOfPizzaType = price;
    }

    public static PizzaType getRegular() {
        return new PizzaType("Regular", 1.0);
    }

    public static PizzaType getCalzone() {
        return new PizzaType("Calzone", 1.5);
    }

    public String getNameOfPizzaType() {
        return nameOfPizzaType;
    }

    public double getPriceOfPizzaType() {
        return priceOfPizzaType;
    }

    @Override
    public String toString() {
        return nameOfPizzaType + " " + priceOfPizzaType;
    }
}
