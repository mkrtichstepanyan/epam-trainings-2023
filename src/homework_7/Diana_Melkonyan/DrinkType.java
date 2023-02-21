package homework_7.Diana_Melkonyan;

public class DrinkType {

   public static final DrinkType Coca_Cola =
           new DrinkType("Coca_Cola", 2);

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
