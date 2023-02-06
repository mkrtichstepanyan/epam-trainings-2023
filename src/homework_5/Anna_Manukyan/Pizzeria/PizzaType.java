package homework_5.Anna_Manukyan.Pizzeria;

public enum PizzaType {
    REGULAR("Regular", 0.0),
    CALZONE("Calzone", 0.5);

    private double cost;
    private String name;

    PizzaType(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }
}
