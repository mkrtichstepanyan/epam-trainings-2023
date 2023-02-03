package homework_5.Alina_Mkhoyan.pizza;


public enum PizzaType {
    Regular("regular", 1.0F),
    Closed("Closed (Calzone)", 1.5F);

    PizzaType(String name, float price) {
        this.name = name;
        this.price = price;
    }

    private final String name;
    private final float price;

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
}