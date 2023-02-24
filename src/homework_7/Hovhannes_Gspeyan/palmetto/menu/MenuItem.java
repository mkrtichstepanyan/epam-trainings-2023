package homework_7.Hovhannes_Gspeyan.palmetto.menu;

public abstract class MenuItem {

    public String name;

    public int quantity;

    public double price;

    public abstract String getName();

    public abstract double calculatePrice();

    public abstract int getQuantity();
}
