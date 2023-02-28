package homework_7.aram;

public abstract class Product {
  private  String name;
   private double price;
  public  int quantity;
    ProductType productType;
    Product(String name, double price, int quantity,ProductType productType){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
        this.productType=productType;
    }
    public abstract double calculatePrice();
    public String getName(){
        return name;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPrice(){
        return price;
    }


}
