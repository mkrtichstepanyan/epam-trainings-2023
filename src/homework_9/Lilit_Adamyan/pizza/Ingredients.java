package homework_9.Lilit_Adamyan.pizza;

public enum Ingredients implements EnumInterface {
    TOMATO_PASTE("Tomato paste",1),
    CHEESE("Cheese",1),
    SALAMI("Salami",1.5),
    BACON("Bacon",1.2),
    GARLIC("Garlic",0.3),
    CORN("Corn",0.7),
    PEPPERONI("Pepperoni",0.6),
    OLIVES("Olives",0.5);

    private String name;
    private double price;

    Ingredients(String name,double p) {
        this.name = name;
        price = p;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
