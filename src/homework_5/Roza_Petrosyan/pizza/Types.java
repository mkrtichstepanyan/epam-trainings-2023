package homework_5.Roza_Petrosyan.pizza;

public enum Types {
    REGULAR("Regular", 1.0),
    CALZONE("Pizza Base (Calzone)", 1.5);

    private final String name;
    private final double price;

    Types(String name, double price) {
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
