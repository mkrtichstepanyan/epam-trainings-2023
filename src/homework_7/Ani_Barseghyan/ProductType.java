package homework_7.Ani_Barseghyan;

public abstract class ProductType {
    private String name;
    private double price;

    public ProductType(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public abstract String getType();
}
