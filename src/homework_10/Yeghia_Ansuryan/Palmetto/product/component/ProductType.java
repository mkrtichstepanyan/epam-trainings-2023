package homework_10.Yeghia_Ansuryan.Palmetto.product.component;

public abstract class ProductType {
    private String name;
    private double price;

    ProductType(String name, double price) {
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
