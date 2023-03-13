package homework_10.Alina_Mkhoyan.pizza;

import homework_10.Alina_Mkhoyan.pizza.exception.InvalidPriceException;

public class Drink extends Product {
    private DrinkType drinkType;

    public Drink(String name, DrinkType drinkType, int quantity) {
        super(name, drinkType.getPrice(), quantity);
        this.drinkType = drinkType;
    }

    public void setPrice(double price) throws InvalidPriceException {
        if (price <= 0) {
            throw new InvalidPriceException("The price cannot be negative.");
        }
        this.price = price;
    }


    public double calculatePrice() {
        return getQuantity() * getPrice();
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

    public void printProductDetails() {
        System.out.println(getName() + " (" + "L"
                + " " + getPrice() + " $" + ")");
    }

}