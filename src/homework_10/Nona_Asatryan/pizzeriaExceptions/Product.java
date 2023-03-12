package homework_10.Nona_Asatryan.pizzeriaExceptions;

import homework_10.Nona_Asatryan.pizzeriaExceptions.customExceptions.ProductQuantityException;
import homework_10.Nona_Asatryan.pizzeriaExceptions.customExceptions.ProductTypeException;

public abstract class Product {

    public int quantity;
    private String name;
   private double price;
   ProductType productType;

    public Product(String name, double price, int quantity, ProductType productType) throws ProductQuantityException, ProductTypeException {
        this.name = name;
        this.price = price;
        if (quantity == 0) {
            throw new ProductQuantityException();
        } else {
            this.quantity = quantity;
        }
        if (productType == null) {
            throw new ProductTypeException();
        } else {
            this.productType = productType;
        }
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
