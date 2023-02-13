package homework_5.Nona_Asatryan.pizzeria_palmetto;

public enum PizzaType {
    REGULAR("Regular", 1),
    CLOSED("Calzone", 0.5);

    private final String name;
    private final double cost;

    PizzaType(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}
