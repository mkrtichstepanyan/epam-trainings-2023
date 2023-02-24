package homework_7.Qnarik_Khachatryan;

public class DrinkType {

    public static final DrinkType Coca_Cola =
            new DrinkType("Coca_Cola", 1);
    public static final DrinkType Fanta =
            new DrinkType("Fanta", 1);
    public static final DrinkType Orange_juice =
            new DrinkType("Orange_juice", 1.5);

    private String name;
    private double price;

    DrinkType(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
