package homework_7.Ani_Barseghyan;

public abstract class Product {
    private String name;
    private int quantity;
    private ProductType productType;

    public abstract double calculatePrice();


    public Product(String name, ProductType productType, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.productType = productType;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductType getProductType() {
        return productType;
    }
}
