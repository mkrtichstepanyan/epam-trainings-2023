package homework_10.anna_manukyan.pizzeria.product;

import homework_10.anna_manukyan.pizzeria.CustomExceptions.ProductTypeException;
import homework_10.anna_manukyan.pizzeria.enums.ProductType;

public class Sweets extends Product {

    static final double PRICE = 5;


    public Sweets(String name, int quantity, ProductType productType) throws ProductTypeException {
        this.name = name;
        this.quantity = quantity;
        if (productType == null) {
            throw new ProductTypeException();
        } else {
            this.productType = productType;
        }
    }


    @Override
    public double calculatePrice() {
        return PRICE;
    }
}
