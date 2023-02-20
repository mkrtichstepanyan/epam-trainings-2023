package homework_5.Alina_Mkhoyan.pizzeria;

public enum PizzaType {
    REGULAR("Regular", 1),
    CLOSED("Calzone", 1.5);

    private String name;
    private double price;

    PizzaType(String name, double price){
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

