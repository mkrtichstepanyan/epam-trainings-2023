package homework_7.Ani_Kovalenko;

public abstract class ItemType {
    private String name;
    private double price;

    ItemType(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }
}
