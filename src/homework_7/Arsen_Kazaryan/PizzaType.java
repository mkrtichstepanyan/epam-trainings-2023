package homework_7.Arsen_Kazaryan;

public enum PizzaType {

    REGULAR("Regular",1),
    CLOSED("Calzone",1.5);

    private final String name;
    private final double price;

    PizzaType(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
