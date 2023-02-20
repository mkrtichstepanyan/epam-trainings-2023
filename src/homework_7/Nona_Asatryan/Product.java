package homework_7.Nona_Asatryan;

public abstract class Product {

    public int quantity;
    private String name;
   private double price;
   ProductType productType;

    public Product(String name, double price, int quantity, ProductType productType) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.productType = productType;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract double calculatePrice();
}
