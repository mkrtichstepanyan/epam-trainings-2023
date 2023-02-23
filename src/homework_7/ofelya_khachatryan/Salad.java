package homework_7.ofelya_khachatryan;

public class Salad extends Product {

    private String name;
    private SaladType saladType;
    private Ingredient[] ingredients;
    private int quantity;

    Salad(String name, SaladType saladType, int quantity) {
        this.name = name;
        this.saladType = saladType;
        this.quantity = quantity;
    }

    @Override
    double calculatePrice() {
        double saladPrice = saladType.getPrice();
        return saladPrice;
    }
}
