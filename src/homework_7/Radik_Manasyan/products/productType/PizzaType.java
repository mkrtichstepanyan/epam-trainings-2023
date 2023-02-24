package homework_7.Radik_Manasyan.products.productType;

import homework_7.Radik_Manasyan.products.productType.ProductType;

public class PizzaType extends ProductType {
    private static final double BASE_PRICE = 1.0;

    public static final ProductType REGULAR = new ProductType("Regular", BASE_PRICE, 0);
    public static final ProductType CALZONE = new ProductType("Calzone", BASE_PRICE, 0.5);

    PizzaType(String name, double basePrice, double additionalPrice) {
        super(name, basePrice, additionalPrice);
    }

}
