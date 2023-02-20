package homework_7.Qnarik_Khachatryan;

public abstract class Product {
    public String name;
    public double price;
    public int quantity;


    public abstract String getName();

    public abstract int getQuantity();

    public abstract double calculatePrice(); //for other products can be price * quantity

}
