package homework_7.Nelli_Poghosyan;


public class DrinkType extends ProductType {
    public static final DrinkType VINE_ARMENIA_DRY = new DrinkType("Armenia", "Armenia", 5.0, "dry");
    public static final DrinkType VINE_ARMENIA_OLD_SEMI_DRY = new DrinkType("Armenia Old", "Armenia", 5.2, "semi dry");
    public static final DrinkType VINE_IJEVAN_SWEET = new DrinkType("Ijevan", "Ijevan", 4.0, "sweet");
    public static final DrinkType VINE_CAGOR_SWEET = new DrinkType("CAGOR", "Armenia", 4.4, "sweet");

    public static final DrinkType COGNAC_ARARAT_5Y = new DrinkType("ARARAT", "Ararat", 10.0, "5 y");

    private String brand;
    private String type;

    public String getBrand() {
        return brand;
    }

    public DrinkType(String name, String brand, double price, String type) {
        super(name, price);
        this.brand = brand;
        this.type = type;
    }
}
