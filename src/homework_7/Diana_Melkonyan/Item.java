package homework_7.Diana_Melkonyan;

abstract class Item {
    public String name;
   public int quantity;


    public abstract String getName();

    public abstract int getQuantity();
    public abstract double calculatePrice();

}

