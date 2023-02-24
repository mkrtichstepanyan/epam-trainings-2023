package homework_7.gohar_hakobyan.product;


public abstract class Product {

    public String name;

    public int quantity;

    public double price;


    public abstract String getName();

    public abstract double calculatePrice();

    public abstract int getQuantity();


}
