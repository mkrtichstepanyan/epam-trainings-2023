package homework_10.Vladimir_Vanyan.Pizza_Project;

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

    public double getPrice(){
        return price;
    };

    public int getQuantity(){
        return quantity;
    }
    public  void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
