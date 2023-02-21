package homework_7.garik_gharibyan.product;

public abstract class Product {
    protected int quantity;
    protected final String name;
    protected double price;

    protected Product(String name,double price){
        this.name = name;
        this.price = price;
    }
    protected Product(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public abstract double getPrice();

    public int getQuantity(){
        return quantity;
    }
    public  void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
