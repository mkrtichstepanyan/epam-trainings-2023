package homework_10.Anush_Ananyan.Pizza.Pizzeria;

public abstract class Product {

    private String name;
    private int quantity;
    private ProductType productType;

      public abstract double calculatePrice();


    public Product(String name, ProductType productType, int quantity) {
        this.name = name;
        this.productType = productType;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }
    public int getQuantity(){
        return quantity;
    }

    public ProductType getProductType() {
        return productType;
    }
}
