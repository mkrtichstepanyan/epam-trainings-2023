package homework_7.garik_gharibyan.drink;

public class AlcoholicDrink extends DrinkNonAlcoholic {

   private final double alcohol_degree;

   private AlcoholicDrink(String name,double price,double alcohol_degree){
      super(name,price);
      this.alcohol_degree = alcohol_degree;
   }

   public double getAlcohol_degree() {
      return alcohol_degree;
   }

   public static AlcoholicDrink WINE = new AlcoholicDrink("Wine",5,10);
   public static AlcoholicDrink VODKA = new AlcoholicDrink("Vodka",7,40);
}
