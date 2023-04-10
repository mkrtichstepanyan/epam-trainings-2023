package homework_5.Anushik_Gevorgyan;

public class PizzaType {
    private String pizzaTypeName;

    private double price;

    private PizzaType(String pizzaTypeName, double price) {
        this.pizzaTypeName = pizzaTypeName;
        this.price = price;
    }


    public static PizzaType getRegular() {
        PizzaType pizzaType = new PizzaType("Regular", 1);
        return pizzaType;
    }

    public static PizzaType getCalzone() {
        PizzaType pizzaType = new PizzaType("Calzone", 1.5);
        return pizzaType;
    }

    public String getPizzaTypeName() {
        return pizzaTypeName;
    }

    public double getPrice() {
        return price;
    }

}
