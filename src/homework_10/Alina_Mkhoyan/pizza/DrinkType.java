package homework_10.Alina_Mkhoyan.pizza;

import homework_10.Alina_Mkhoyan.pizza.exception.InvalidPriceException;

public enum DrinkType {

    COLA_SMALL("Coca-Cola small", 1, 1),

    COLA_LARGE("Coca-Cola large", 2, 3),

    FANTA_SMALL("Fanta small", 1, 1),

    FANTA_LARGE("Fanta large", 2, 3),

    SPRITE_SMALL("Sprite small", 1, 1),

    SPRITE_LARGE("Sprite large", 2, 3);

    private final String name;
    private double litre;
    private double price;

    DrinkType(String name, double litre, double price) {
        this.name = name;
        this.litre = litre;
        this.price = price;
    }

    public void setPrice(double price) throws InvalidPriceException {
        if (price <= 0) {
            throw new InvalidPriceException("The price cannot be negative.");
        }
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getLitre() {
        return litre;
    }
}