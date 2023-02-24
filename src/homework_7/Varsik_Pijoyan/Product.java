package homework_7.Varsik_Pijoyan;

public abstract class Product {
     protected String name;
     protected int quantity;


     public String getName(){
          return name;
     }

     public int getQuantity(){
          return quantity;
     }

     public abstract double calculatePrice();
}
