package homework_10.anna_manukyan.pizzeria.enums;


import static homework_10.anna_manukyan.pizzeria.product.Product.BASE_COST;

public enum ProductType {
    PIZZA("pizza", BASE_COST),
    SWEETS("sweets", 0),
    DRINK("drink", 0);
    private String name;
    private double price;

    ProductType(String name, double basePrice) {
        this.name = name;
        this.price = basePrice;
    }

    public String getName() {
        return name;
    }
}
