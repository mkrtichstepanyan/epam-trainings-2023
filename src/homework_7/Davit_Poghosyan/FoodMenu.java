package homework_7.Davit_Poghosyan;

public abstract class FoodMenu {
    private int quantity;
    private String name;

    public FoodMenu(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;

    }
    public FoodMenu(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

}
