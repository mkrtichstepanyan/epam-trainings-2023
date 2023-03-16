package homework_10.anna_manukyan.pizzeria.product;

import homework_10.anna_manukyan.pizzeria.CustomExceptions.ProductQuantityException;
import homework_10.anna_manukyan.pizzeria.annotations.NotNull;
import homework_10.anna_manukyan.pizzeria.enums.ProductType;

public abstract class Product {
    public static double BASE_COST;

    @NotNull
    public ProductType productType;

    public String name;

    public int quantity;

    protected Product() {
    }

    public Product(String name, int quantity, ProductType productType) {
        this.name = name;
        this.quantity = quantity;
        this.productType = productType;
    }

    public Product(String name, int quantity, String foodType) {
        this.name = name;
        this.quantity = quantity;
        String upperCase = foodType.toUpperCase();
        switch (upperCase) {
            case "SWEETS" -> this.productType = ProductType.SWEETS;
            case "PIZZA" -> this.productType = ProductType.PIZZA;
        }
    }

    public abstract double calculatePrice();

    public void setQuantity(int quantity) throws ProductQuantityException {
        if (quantity <= 0) {
            throw new ProductQuantityException();
        } else {
            this.quantity = quantity;
        }
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public ProductType getFoodType() {
        return productType;
    }
}
