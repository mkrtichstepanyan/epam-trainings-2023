package homework_7.sevak.Ani_Barseghyan;

public class BeveragesMenu {
    public static final BeveragesMenu BEER = new BeveragesMenu("Beer", 3.0);
    public static final BeveragesMenu SODA = new BeveragesMenu("Coca-Cola", 2.5);
    private String name;
    private double price;

    public BeveragesMenu(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
