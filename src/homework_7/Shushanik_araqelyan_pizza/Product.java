package homework_7.Shushanik_araqelyan_pizza;

public abstract class Product {

    public String name; //TODO need to find out access mode.
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


