package homework_7.sevak.Anushik__Gevorgyan;

public class Drink extends Product {
    public static final Drink MARTINI=new Drink("Martini",6.0);
    public static final Drink MOJITO=new Drink("Mojito",5.0);

   private String name;
   private double price;


    private Drink(String name, double price) {
        this.name = name;
        this.price = price;

    }
    public double calculatePrice(){
        return this.getPrice();
    }


    public double getPrice() {

        return super.getPrice();
    }
}



