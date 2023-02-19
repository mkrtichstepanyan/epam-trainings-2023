package homework_7.sevak.Diana_Melkonyan;

public class Drink extends Calculacia{
    private String name;
    private int quantity;

    public Drink(String name, int quantity){
        this.name=name;
        this.quantity = quantity;
    }

    @Override
    public double calculatePrice() {
        return 0;
    }
    public int getQuantity(){
        return quantity;
    }

    public String getName() {
        return name;
    }
}
