package homework_7.TatevKocharyan;

import homework_5.Alina_Mkhoyan.pizza.Ingredient;

public abstract class Product {
    private String name;
    private int quantity;
    private ProductType productType;

    public Product(String name,ProductType productType, int quantity) {
        this.name = name;
        this.productType=productType;
        this.quantity = quantity;
    }

    public ProductType getProductType() {
        return productType;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public abstract double calculatePrice();


}
