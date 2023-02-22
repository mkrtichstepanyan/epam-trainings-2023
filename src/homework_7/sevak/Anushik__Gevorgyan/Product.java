package homework_7.sevak.Anushik__Gevorgyan;

public  abstract class Product {
    private String name;
    private int quantity;


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
}
