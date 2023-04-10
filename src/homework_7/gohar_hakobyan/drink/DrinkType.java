package homework_7.gohar_hakobyan.drink;

import homework_7.gohar_hakobyan.product.ProductType;

public class DrinkType extends ProductType {
    private static final double BASE_PRICE = 0.5;

    public static final DrinkType MINERAL =
            new DrinkType("Mineral", BASE_PRICE, 1);
    public static final DrinkType JUICE =
            new DrinkType("Juice", BASE_PRICE, 0.5);
    public static final DrinkType PEPSI =
            new DrinkType("Pepsi", BASE_PRICE, 1.5);


    private double additionalPrice;

    DrinkType(String name, double basePrice, double additionalPrice) {
        this.name = name;
        this.price = basePrice + additionalPrice;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
