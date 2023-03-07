package homework_7.Davit_Poghosyan;

public abstract class Product {
    private int quantity;
    private String name;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;

    }
    public Product(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

}
