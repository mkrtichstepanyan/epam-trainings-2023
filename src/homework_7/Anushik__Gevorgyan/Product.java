package homework_7.Anushik__Gevorgyan;

public  abstract class Product {
    private String name;
    private int quantity;
    private double price;


    public ProductType productType;

    public abstract double calculatePrice();



    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public int getQuantity(){

        return quantity;
    }
    public void setPrice(double price ){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }
}



