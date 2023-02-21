package homework_7.Qnarik_Khachatryan;

public class Drink extends Product {

    private DrinkType drinkType;
    private String name;
    private int quantity;

    Drink(DrinkType drinkType, String name, int quantity) {
        this.drinkType = drinkType;
        this.name = name;
        this.quantity = quantity;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public double calculatePrice() {
        return drinkType.getPrice();
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }
}
