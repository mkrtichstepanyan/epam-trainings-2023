package homework_7.Alina_Mkhoyan.pizza;

public class Drink extends Product {
    private DrinkType drinkType;

    public Drink(String name, DrinkType drinkType, int quantity) {
        super(name, drinkType.getPrice(), quantity);
        this.drinkType = drinkType;
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