package homework_7.Nelli_Poghosyan;

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
    public String getName(){
        return name;
    }
}
