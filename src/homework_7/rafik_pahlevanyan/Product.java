package homework_7.rafik_pahlevanyan;

public abstract class Product {

    public String name;
    public int quantity;


    public abstract double calculatePrice();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

}
