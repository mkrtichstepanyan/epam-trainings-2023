package homework_7.Karen_Mikayelyan;

public class Drink extends Product {
    private double litre;
    private DrinkType drinkType;
        public Drink(String name, DrinkType drinkType, int quantity) {
        super(name, drinkType.getPrice(), quantity, ProductType.DRINK);
        this.drinkType = drinkType;
    }

    public double getLitre() {
        return litre;
    }

    public void setLitre(double litre) {
        this.litre = litre;
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(DrinkType drinkType) {
        this.drinkType = drinkType;
    }

    @Override
    public double calculatePrice() {
        return this.drinkType.getPrice();
    }
}
