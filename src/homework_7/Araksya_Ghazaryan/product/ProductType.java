package homework_7.Araksya_Ghazaryan.product;

public class ProductType {
    String name;
    double price;

    public ProductType(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double getPrice(){
        return  price;
    }
    public String getName(){
        return name;
    }
}