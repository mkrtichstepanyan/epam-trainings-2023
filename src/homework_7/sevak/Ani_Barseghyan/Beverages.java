package homework_7.sevak.Ani_Barseghyan;

public class Beverages extends OrderItem {

    public static final double DEFAULT_DRINK_PRICE = 5.0;
    public static final int DEFAULT_DRINK_QUANTITY = 1;
    private int quantity;
    private String name;
    private double price;

    Beverages(BeveragesMenu beverage, int quantity) {
        super(beverage.getName(), quantity);
        this.name = beverage.getName();
        this.price = beverage.getPrice();
    }


    public double calculatePrice() {
        return price * quantity;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
