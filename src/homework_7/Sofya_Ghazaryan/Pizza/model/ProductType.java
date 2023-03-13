package homework_7.Sofya_Ghazaryan.Pizza.model;

public class ProductType {
    private String name;
    private double price;

    public ProductType() {
    }

    public ProductType(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
