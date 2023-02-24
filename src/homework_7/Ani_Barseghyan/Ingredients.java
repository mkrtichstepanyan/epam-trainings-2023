package homework_7.Ani_Barseghyan;

public abstract class Ingredients {
    private String name;
    private double price;

    public Ingredients(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
}
