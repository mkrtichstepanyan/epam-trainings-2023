package homework_7.Anushik__Gevorgyan;

public class ProductType {
    private String name;
    private double price;

    public ProductType(String name,double price){
        this.name=name;
        this.price=price;
    }
    public String  getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
}
