package homework_5.Alina_Mkhoyan.pizza;


public enum PizzaType {
    Regular("regular", 1.0),
    Closed("Closed (Calzone)", 1.5);

    PizzaType(String name, double price) {
        this.name = name;
        this.price = price;
    }

    private final String name;
    private final double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}