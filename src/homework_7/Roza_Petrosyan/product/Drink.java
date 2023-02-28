package homework_7.Roza_Petrosyan.product;

import homework_7.Roza_Petrosyan.productType.ProductType;

public class Drink extends Product {
    private ProductType productType;

    public Drink(String name, ProductType productType, int quantity) {
        super(name, quantity);
        this.productType = productType;
    }

    @Override
    public double calculatePrice() {
        return productType.getPrice();
    }

    public ProductType getProductType() {
        return productType;
    }
}
