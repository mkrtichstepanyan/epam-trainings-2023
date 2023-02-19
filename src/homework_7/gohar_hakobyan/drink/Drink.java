package homework_7.gohar_hakobyan.drink;

import homework_7.gohar_hakobyan.product.Product;

public class Drink extends Product {
    private DrinkType drinkType;

    public Drink(DrinkType drinkType, int quantity) {
        this.drinkType = drinkType;
        this.quantity = quantity;
        this.name = drinkType.getName();
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public double calculatePrice() {
        return this.drinkType.getPrice();
    }

    @Override
    public int getQuantity() {
        return quantity;
    }


    public String getDrinkType() {
        return drinkType.getName();
    }
}

