package homework_7.sevak.Ani_Barseghyan;

public abstract class OrderItem {
    private String name;
    private int quantity;

    OrderItem(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public abstract double calculatePrice();
}
