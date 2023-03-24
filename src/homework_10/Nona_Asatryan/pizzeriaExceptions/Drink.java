package homework_10.Nona_Asatryan.pizzeriaExceptions;

import homework_10.Nona_Asatryan.pizzeriaExceptions.customExceptions.ProductQuantityException;
import homework_10.Nona_Asatryan.pizzeriaExceptions.customExceptions.ProductTypeException;

public class Drink extends Product {
    private double litre;
    private DrinkType drinkType;
    private Drink[] drinks;


    public Drink(String name, DrinkType drinkType, int quantity) throws ProductQuantityException, ProductTypeException {
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
