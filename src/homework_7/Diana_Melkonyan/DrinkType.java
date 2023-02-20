package homework_7.Diana_Melkonyan;

public class DrinkType {
   // private static final DrinkType COLA= new DrinkType("Cola",  0);
   public static final DrinkType Coca_Cola =
           new DrinkType("Coca_Cola", 1);

    private String name;
    private double price;

    DrinkType(String name, double price){
        this.name=name;
      this.price=price;
    }

    public double getPrice() {
        return price;
    }


}
