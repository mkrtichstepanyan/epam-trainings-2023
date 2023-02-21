package homework_7.Diana_Melkonyan;

abstract class Item {
    protected String name;
   protected int quantity;


    public String getName(){
        return name;
    }

    public int getQuantity(){

        return quantity;
    };
    public abstract double calculatePrice();

}

