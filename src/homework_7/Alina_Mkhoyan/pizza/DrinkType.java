package homework_7.Alina_Mkhoyan.pizza;

public class DrinkType {

    public static final DrinkType COLA_SMALL = new DrinkType(1, 1);
    public static final DrinkType COLA_MIDDLE = new DrinkType(1.5, 2);
    public static final DrinkType COLA_LARGE = new DrinkType(2, 3);
    public static final DrinkType FANTA_SMALL = new DrinkType(1, 1);
    public static final DrinkType FANTA_MIDDLE = new DrinkType(1.5, 2);
    public static final DrinkType FANTA_LARGE = new DrinkType(2, 3);
    public static final DrinkType SPRITE_SMALL = new DrinkType(1, 1);
    public static final DrinkType SPRITE_MIDDLE = new DrinkType(1.5, 2);
    public static final DrinkType SPRITE_LARGE = new DrinkType(2, 3);

    private double litre;
    private double price;

    DrinkType(double litre, double price) {
        this.litre = litre;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double getLitre() {
        return litre;
    }
}