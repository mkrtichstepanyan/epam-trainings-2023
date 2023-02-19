package homework_7.Alina_Mkhoyan.pizza;


public class DrinkType {

    public static final DrinkType COCA_COLA = new DrinkType("Coca-Cola", 1.5, 5);
    public static final DrinkType PEPSI =   new DrinkType("Pepsi",  0.5, 3);
    public static final DrinkType FANTA =   new DrinkType("Fanta",  2,  8);
    public static final DrinkType SPRITE =   new DrinkType("Sprite",  1.5, 6);

    private String name;
    private double litre;
    private double price;


    DrinkType(String name, double litre, double price) {
        this.name = name;
        this.litre = litre;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double getLitre() {
        return litre;
    }

    public String getName() {
        return name;
    }

}
