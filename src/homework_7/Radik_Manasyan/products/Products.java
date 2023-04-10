package homework_7.Radik_Manasyan.products;

import homework_7.Radik_Manasyan.products.productType.ProductType;

public abstract class Products {
    private String name;
    private ProductType productType;
    private int quantity;

    public Products(String name, ProductType productType, int quantity) {
        this.name = name;
        this.productType = productType;
        this.quantity = quantity;
    }

    public abstract double calculatePrice();

    public abstract Ingredient[] getIngredients();

    public String getName() {
        return name;
    }

    public ProductType getProductType() {
        return productType;
    }

    public int getQuantity() {
        return quantity;
    }
}
