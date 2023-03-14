package homework_10.Anush_Ananyan.Pizza.Pizzeria;

public abstract class ProductType {
    private String name;
    private double price;

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
